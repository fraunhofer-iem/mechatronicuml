	within Root_cic.A1.Behavior.Complex_Behavior_init.Region1.Complex_Region1_Composite.InnerRegion.Complex_innerRegion_inner1.Composite2;
model Composite2 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-57.15, -114.3}, {57.15, 114.3}})));
		// attribute declarations
		outer  Integer inner1ExitVar;
		outer  Boolean CompositeE1;
		outer  Integer i;
		outer  Integer CompositeExitVar;
		outer  Integer CompositeE2;
		outer  Boolean inner1E1;
		outer  Integer inner1E2;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step E2(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{15.875, 0.0},{41.275, 12.7}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step generatedInitState(
			nIn=1,
			nOut=2)
			annotation (Placement(transformation(extent={{15.875, 101.6},{41.275, 114.3}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step someState(
			nIn=2,
			nOut=1)
			annotation (Placement(transformation(extent={{15.875, 50.8},{41.275, 63.5}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_generatedInitState_2_someState(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(inner1E1) == true
				
			)
			annotation (Placement(transformation(extent={{31.75, 76.19999999999999},{57.15, 88.89999999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_generatedInitState_1_someState(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{0.0, 76.19999999999999},{25.4, 88.89999999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_someState_1_E2(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{15.875, 25.4},{41.275, 38.099999999999994}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// trigger message event declarations (non port rtsc)
		// end trigger message event declarations (non port rtsc)
	equation
			// connect initial step
			connect(entry[1], generatedInitState.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect generatedInitState -> someState
			connect(generatedInitState.outPort[1],
					transition_generatedInitState_2_someState.inPort)
				annotation (Line(points={ {28.575,101.6}, {28.575,101.6}, {44.449999999999996,88.89999999999999}, {44.449999999999996,88.89999999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_generatedInitState_2_someState.outPort,
					someState.inPort[1])
				annotation (Line(points={ {44.449999999999996,76.19999999999999}, {44.449999999999996,76.19999999999999}, {28.575,63.5}, {28.575,63.5}}, color={0,0,0}, smooth=Smooth.None));
			// connect generatedInitState -> someState
			connect(generatedInitState.outPort[2],
					transition_generatedInitState_1_someState.inPort)
				annotation (Line(points={ {28.575,101.6}, {28.575,101.6}, {12.7,88.89999999999999}, {12.7,88.89999999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_generatedInitState_1_someState.outPort,
					someState.inPort[2])
				annotation (Line(points={ {12.7,76.19999999999999}, {12.7,76.19999999999999}, {28.575,63.5}, {28.575,63.5}}, color={0,0,0}, smooth=Smooth.None));
			// connect someState -> E2
			connect(someState.outPort[1],
					transition_someState_1_E2.inPort)
				annotation (Line(points={ {28.575,50.8}, {28.575,50.8}, {28.575,38.099999999999994}, {28.575,38.099999999999994}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_someState_1_E2.outPort,
					E2.inPort[1])
				annotation (Line(points={ {28.575,25.4}, {28.575,25.4}, {28.575,12.7}, {28.575,12.7}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Composite2;

