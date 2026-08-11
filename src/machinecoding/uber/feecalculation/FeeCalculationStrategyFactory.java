package machinecoding.uber.feecalculation;

import machinecoding.parkinglot.decorator.FeeSurgeDecorator;
import machinecoding.uber.enums.FeeCalculationStrategyType;
import machinecoding.uber.enums.FeeSurgeDecoratorType;

import java.util.List;

public class FeeCalculationStrategyFactory {
    public static FeeCalculationStrategy getFeeCalculationStrategy(
            FeeCalculationStrategyType feeCalculationStrategyType, List<FeeSurgeDecoratorType> feeSurgeDecoratorTypeList) {
        FeeCalculationStrategy feeCalculationStrategy = null;
        if (feeCalculationStrategyType.equals(FeeCalculationStrategyType.TIME)) {
            feeCalculationStrategy = new TimeBasedFeeCalculationStrategy();
        }
        else if(feeCalculationStrategyType.equals(FeeCalculationStrategyType.DISTANCE)){
            feeCalculationStrategy = new DistancedBasedFeeCalculationStrategy();
        }


        for(FeeSurgeDecoratorType feeSurgeDecoratorType: feeSurgeDecoratorTypeList){
            if(feeSurgeDecoratorType.equals(FeeSurgeDecoratorType.FESTIVAL)){
                feeCalculationStrategy = new FestivalSurgeDecorator(feeCalculationStrategy);
            }
            else if(feeSurgeDecoratorType.equals(FeeSurgeDecoratorType.RAIN)){
                feeCalculationStrategy = new RainSurgeDecorator(feeCalculationStrategy);
            }
            else if(feeSurgeDecoratorType.equals(FeeSurgeDecoratorType.NIGHT)){
                feeCalculationStrategy = new NightSurgeDecorator(feeCalculationStrategy);
            }
        }

        return feeCalculationStrategy;

    }
}
