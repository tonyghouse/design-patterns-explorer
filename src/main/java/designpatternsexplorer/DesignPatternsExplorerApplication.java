package designpatternsexplorer;

import designpatternsexplorer.behavioural.observer.ObserverExplorer;
import designpatternsexplorer.behavioural.strategy.StrategyExplorer;
import designpatternsexplorer.creational.abstractfactory.AbstractFactoryExplorer;
import designpatternsexplorer.creational.builder.BuilderExplorer;
import designpatternsexplorer.creational.factory.FactoryExplorer;
import designpatternsexplorer.structural.decorator.DecoratorExplorer;
import designpatternsexplorer.structural.facade.FacadeExplorer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import creational.sigleton.SingletonExplorer;

import java.io.IOException;

@SpringBootApplication
public class DesignPatternsExplorerApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(DesignPatternsExplorerApplication.class, args);

		System.out.println("Design Patterns Explorer");

		/* Creational Design patterns */
		SingletonExplorer.explore();
		AbstractFactoryExplorer.explore();
		FactoryExplorer.explore();
		BuilderExplorer.explore();


		/* Structural Design patterns */
		FacadeExplorer.explore();
		DecoratorExplorer.explore();


		/* Behavioral Design patterns */
		ObserverExplorer.explore();
		StrategyExplorer.explore();

	}

}
