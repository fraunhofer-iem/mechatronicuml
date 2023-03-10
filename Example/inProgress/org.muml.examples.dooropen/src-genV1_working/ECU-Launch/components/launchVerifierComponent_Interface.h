		#ifndef LAUNCHVERIFIERCOMPONENT_Interface_H_
		#define LAUNCHVERIFIERCOMPONENT_Interface_H_

#ifdef __cplusplus
  extern "C" {
#endif		// Library
	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"
		#include "../lib/port.h"
		#include "../../../src-genV1_working/ECU-Launch/messages/messages_types.h"
	
	#include "../lib/clock.h"
	#include "../lib/Debug.h"


			
			
		//#include "../continuousComponents/contImplementations.h"	

		//#include "../RTSCs/launchVerifierLaunchVerifierStateChart.h"
			/*****
 			 *
 			 *  Forward Delcaration of Container Functions
 			 *
 			 */		
					bool_t MCC_LaunchVerifierComponent_peer1_recv_M1LaunchCode_M1_Message(Port* p, M1LaunchCode_M1_Message* msg);
					bool_t MCC_LaunchVerifierComponent_peer1_exists_M1LaunchCode_M1_Message(Port* p);
					bool_t MCC_LaunchVerifierComponent_peer2_recv_M1LaunchCode_M1_Message(Port* p, M1LaunchCode_M1_Message* msg);
					bool_t MCC_LaunchVerifierComponent_peer2_exists_M1LaunchCode_M1_Message(Port* p);
			
						void MCC_LaunchVerifierComponent_verifiedLaunch_send_value(Port* p, bool_T* value);
			
			
	
			/*****
 			 *
 			 *  Component Functions
 			 *
 			 */
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component of Type: LaunchVerifier
			 * @details This files contains a description of the LaunchVerifier in form of the LaunchVerifierComponent
			 * 			and all methods which can be executed on an Instance of this Component
			 */
				
						/**
						 * @brief Forward Declaration of the struct LaunchVerifierLaunchVerifierStateChart which describes the behavior of LaunchVerifierComponent
						 * 
						 */
						 typedef struct LaunchVerifierLaunchVerifierStateChart LaunchVerifierLaunchVerifierStateChart;
						/**
						 * @brief Forward Declaration of the struct LaunchVerifierComponent
						 */
							typedef struct LaunchVerifierComponent LaunchVerifierComponent;
						
						/**
						*  
						* @brief Description for a ComponentInstance of Type: LaunchVerifier
						* @details This struct describes a specific Component Instances which is typed over the Component: LaunchVerifier
						*/
						struct LaunchVerifierComponent {
						
								uint8_T ID;	
						
						
									LaunchVerifierLaunchVerifierStateChart* stateChart;	/**< The LaunchVerifierLaunchVerifierStateChart of the Component LaunchVerifier */
							
										Port peer1Port; /**< A  Component's Port: peer1 */
										Port peer2Port; /**< A  Component's Port: peer2 */
										Port verifiedLaunch; /**< A  Component's Port: verifiedLaunch */
						
											void (*setterOf_verifiedLaunch)(bool_T);/**< A Pointer to the setter function of the hybrid port: verifiedLaunch */
						
									
								
								
						
								LaunchVerifierComponent * next;/**< A Pointer to the next component part, if this component ist part of a multipart in the CIC */
								
							};
					
						/**
						* @brief This Methodes intializes the Component: LaunchVerifier
						* @details All struct members of the struct LaunchVerifierComponent are initialized
						* 
						* @param component The LaunchVerifierComponent to be initialized
						*/	
							void LaunchVerifierComponent_initialize(LaunchVerifierComponent* component);
				
						/**
						* @brief Creates a Instance of the Component: LaunchVerifier
						* @details Allocates Memory for the struct LaunchVerifierComponent
						* @return A Pointer to the new created LaunchVerifierComponent
						*/
							LaunchVerifierComponent LaunchVerifierComponent_create();
				
						/**
						 * @brief Destroys a Component: LaunchVerifier
						 * @details Frees the Memory for the struct LaunchVerifierComponent
						 * 
						* @param component The specific LaunchVerifierComponent to be destroyed
						 */
							void LaunchVerifierComponent_destroy(LaunchVerifierComponent* component);
					
						
						/**
						* @brief Executes the next Step of the behavior an Instance of the Component: LaunchVerifier
						* @details The behavior of the Component:  LaunchVerifier is executed.
						*			
						* @param component The LaunchVerifierComponent whose behavior shall be checked
						*/
							void LaunchVerifierComponent_processStep(LaunchVerifierComponent* component);
						/**
								 * @brief Get the Port: peer1 of an Instance of the Component: LaunchVerifier
								 * @details The Pointer LaunchVerifierComponent::peer1Port is returned
								 * 
								 * @param component The specific Instance LaunchVerifierComponent  of the Component: LaunchVerifier whose Port shall be returned
								 * @return A Pointer to the Port peer1 of the struct LaunchVerifierComponent
								 */
								Port* LaunchVerifierComponent_getpeer1(LaunchVerifierComponent* component);
						/**
								 * @brief Get the Port: peer2 of an Instance of the Component: LaunchVerifier
								 * @details The Pointer LaunchVerifierComponent::peer2Port is returned
								 * 
								 * @param component The specific Instance LaunchVerifierComponent  of the Component: LaunchVerifier whose Port shall be returned
								 * @return A Pointer to the Port peer2 of the struct LaunchVerifierComponent
								 */
								Port* LaunchVerifierComponent_getpeer2(LaunchVerifierComponent* component);
					
						



			/*****
 			 *
 			 *  RealtimeStatechart Functions
 			 *
 			 */

			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Realtime-StateChart: LaunchVerifierLaunchVerifier
			 * @details This files contains the description of the Realtime-StateChart: LaunchVerifierLaunchVerifier and its behavior which is executed
			 */
			
			//ENUM
				/** 
				 * @brief This enum represents the States of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 */
					typedef enum {
						LAUNCHVERIFIERLAUNCHVERIFIER_INACTIVE,
						STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAIN /**< Represents the State: STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAIN of the Realtime-StateChart: LaunchVerifierLaunchVerifier */
						,
								STATE_LAUNCHVERIFIERPEER1MASTER_MAIN /**< Represents the State: STATE_LAUNCHVERIFIERPEER1MASTER_MAIN of the Realtime-StateChart: LaunchVerifierPeer1Master_peer1 */
						,		STATE_LAUNCHVERIFIERPEER2MASTER_MAIN /**< Represents the State: STATE_LAUNCHVERIFIERPEER2MASTER_MAIN of the Realtime-StateChart: LaunchVerifierPeer2Master_peer2 */
						,		STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED /**< Represents the State: STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTUNVERIFIED of the Realtime-StateChart: LaunchVerifierLaunchVerifier_mainStatechart */
						,		STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED /**< Represents the State: STATE_LAUNCHVERIFIERLAUNCHVERIFIER_MAINSTATECHARTVERIFIED of the Realtime-StateChart: LaunchVerifierLaunchVerifier_mainStatechart */	
					}LaunchVerifierLaunchVerifierState;
				
				
					/**
					 * 
					 * @brief Description of the Realtime-StateChart: LaunchVerifierLaunchVerifier
					 * @details This struct represents the  Realtime-StateChart: LaunchVerifierLaunchVerifier and its States
					 */
				struct LaunchVerifierLaunchVerifierStateChart {	
						LaunchVerifierComponent * parentComponent;/**< A pointer to the parent ComponentInstance of Type: LaunchVerifierComponent , which has this Realtime-StateChart as its behavior */			
				
				
									LaunchVerifierLaunchVerifierState currentStateOfLaunchVerifierLaunchVerifier;/**< The current State of the Realtime-StateChart: LaunchVerifierLaunchVerifier */
				
							LaunchVerifierLaunchVerifierState currentStateOfLaunchVerifierPeer1Master_peer1;/**< Represents the state of region: LaunchVerifierPeer1Master_peer1 */
							LaunchVerifierLaunchVerifierState currentStateOfLaunchVerifierPeer2Master_peer2;/**< Represents the state of region: LaunchVerifierPeer2Master_peer2 */
							LaunchVerifierLaunchVerifierState currentStateOfLaunchVerifierLaunchVerifier_mainStatechart;/**< Represents the state of region: LaunchVerifierLaunchVerifier_mainStatechart */
				
						bool_t LaunchVerifierLaunchVerifier_isExecutable;/**< Execution Verifier of RTSC: LaunchVerifierLaunchVerifier. This variable is used to ensure that a RTSC is executed only once per execution cycle */
							bool_t LaunchVerifierPeer1Master_peer1_isExecutable;/**< Execution Verifier of RTSC: LaunchVerifierPeer1Master_peer1. This variable is used to ensure that a RTSC is executed only once per execution cycle */
							bool_t LaunchVerifierPeer2Master_peer2_isExecutable;/**< Execution Verifier of RTSC: LaunchVerifierPeer2Master_peer2. This variable is used to ensure that a RTSC is executed only once per execution cycle */
							bool_t LaunchVerifierLaunchVerifier_mainStatechart_isExecutable;/**< Execution Verifier of RTSC: LaunchVerifierLaunchVerifier_mainStatechart. This variable is used to ensure that a RTSC is executed only once per execution cycle */
					
				
				
					
				
							int32_T peer1; /**< The Realtime-StateChart Variable: peer1 of Type: int32; */
							int32_T peer2; /**< The Realtime-StateChart Variable: peer2 of Type: int32; */
				
								bool_T verifiedLaunch;
				
				
						
				
					} ;
			
			//METHOD STUBS
				/**
				 * @brief Creates an Instance of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details Allocates Memory for the struct LaunchVerifierLaunchVerifierStateChart
				 * 
				 * @param parentComponent An Instance of the Component: LaunchVerifierComponent which behavior is described via this Realtime-StateChart
				 * @return A Pointer to the new created LaunchVerifierLaunchVerifierStateChart
				 */
					LaunchVerifierLaunchVerifierStateChart* LaunchVerifierLaunchVerifierStateChart_create(LaunchVerifierComponent* parentComponent);
				/**
				 * @brief Initializes an Instance of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details All struct members of the struct LaunchVerifierLaunchVerifierStateChart are initialized,
				 *			and all Regions of the Realtime-StateChart are initialized, too.
				 * 
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart to be initialized
				 */
					void LaunchVerifierLaunchVerifierStateChart_initialize(LaunchVerifierLaunchVerifierStateChart* rtsc);
				/**
				 * @brief Initializes the Region: LaunchVerifierPeer1Master_peer1 of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details The Member LaunchVerifierLaunchVerifierStateChart::currentStateOfLaunchVerifierPeer1Master_peer1 is initialized
				 * 
				 * @param stateChart The specific LaunchVerifierLaunchVerifierStateChart whose Region shall be initialized
				 */
				
					void initializeLaunchVerifierPeer1Master_peer1Region(LaunchVerifierLaunchVerifierStateChart* stateChart);
				/**
				 * @brief Initializes the Region: LaunchVerifierPeer2Master_peer2 of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details The Member LaunchVerifierLaunchVerifierStateChart::currentStateOfLaunchVerifierPeer2Master_peer2 is initialized
				 * 
				 * @param stateChart The specific LaunchVerifierLaunchVerifierStateChart whose Region shall be initialized
				 */
				
					void initializeLaunchVerifierPeer2Master_peer2Region(LaunchVerifierLaunchVerifierStateChart* stateChart);
				/**
				 * @brief Initializes the Region: LaunchVerifierLaunchVerifier_mainStatechart of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details The Member LaunchVerifierLaunchVerifierStateChart::currentStateOfLaunchVerifierLaunchVerifier_mainStatechart is initialized
				 * 
				 * @param stateChart The specific LaunchVerifierLaunchVerifierStateChart whose Region shall be initialized
				 */
				
					void initializeLaunchVerifierLaunchVerifier_mainStatechartRegion(LaunchVerifierLaunchVerifierStateChart* stateChart);
				/**
				 * @brief Destroys the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details Frees the Memory for the struct LaunchVerifierLaunchVerifierStateChart
				 * 
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart to be destroyed
				 */	
					void LaunchVerifierLaunchVerifierStateChart_destroy(LaunchVerifierLaunchVerifierStateChart* rtsc);		
				/**
				 * @brief Executes the next Step of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * 
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart to be executed
				 */	
					void LaunchVerifierLaunchVerifierStateChart_processStep(LaunchVerifierLaunchVerifierStateChart* rtsc);
			
				/**
				 * @brief Leaves the Region: master_peer2 of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details This method is called, whenever a the Region: master_peer2 is left.
				 * 			The correct State is set and all Exit-Events are executed.
				 *
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart whose Region: master_peer2 shall be exit
				 */
					void LaunchVerifierPeer2Master_peer2StateChart_exit(LaunchVerifierLaunchVerifierStateChart* rtsc);
				/**
				 * @brief Leaves the Region: master_peer1 of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details This method is called, whenever a the Region: master_peer1 is left.
				 * 			The correct State is set and all Exit-Events are executed.
				 *
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart whose Region: master_peer1 shall be exit
				 */
					void LaunchVerifierPeer1Master_peer1StateChart_exit(LaunchVerifierLaunchVerifierStateChart* rtsc);
				/**
				 * @brief Leaves the Region: statechart of the Realtime-StateChart: LaunchVerifierLaunchVerifier
				 * @details This method is called, whenever a the Region: statechart is left.
				 * 			The correct State is set and all Exit-Events are executed.
				 *
				 * @param rtsc The specific LaunchVerifierLaunchVerifierStateChart whose Region: statechart shall be exit
				 */
					void LaunchVerifierLaunchVerifier_mainStatechartStateChart_exit(LaunchVerifierLaunchVerifierStateChart* rtsc);
						
				/**
				 * @brief Returns wether the Realtime-StateChart: LaunchVerifierLaunchVerifier is in a specific State
				 * 
				 * @param rtsc The specific Realtime-StateChart: LaunchVerifierLaunchVerifierStateChart
				 * @param state One of the States of the Enum: LaunchVerifierLaunchVerifierState
				 * 
				 * @return True, If the Realtime-StateChart is in the specific State, otherwise False
				 */	
					bool_t LaunchVerifierLaunchVerifierStateChart_isInState(LaunchVerifierLaunchVerifierStateChart* rtsc, LaunchVerifierLaunchVerifierState state);
#ifdef __cplusplus
  }
#endif
		#endif /* LAUNCHVERIFIERCOMPONENT_Interface_H_ */
