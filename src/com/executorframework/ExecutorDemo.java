package com.executorframework;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] cpt = { new CheckProcessorTask("ATM"), new CheckProcessorTask("bank"),
				new CheckProcessorTask("mobile"), new CheckProcessorTask("web") };
		ExecutorService es = Executors.newFixedThreadPool(2);
		for (CheckProcessorTask checkProcessorTask : cpt) {
			es.submit(checkProcessorTask);
		}
		es.shutdown();

	}

}
