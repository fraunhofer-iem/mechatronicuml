

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#ifndef MUML_DDSPlugin_1362043835_h
#define MUML_DDSPlugin_1362043835_h

#include "MUML_DDS.h"

struct RTICdrStream;

#ifndef pres_typePlugin_h
#include "pres/pres_typePlugin.h"
#endif

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

#define DDS_MessagesdoneOrder_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_MessagesdoneOrder_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_MessagesdoneOrder_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_MessagesdoneOrder_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_MessagesdoneOrder_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_MessagesdoneOrder_Messages*
DDS_MessagesdoneOrder_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_MessagesdoneOrder_Messages*
DDS_MessagesdoneOrder_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_MessagesdoneOrder_Messages*
DDS_MessagesdoneOrder_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPluginSupport_copy_data(
    DDS_MessagesdoneOrder_Messages *out,
    const DDS_MessagesdoneOrder_Messages *in);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPluginSupport_destroy_data_w_params(
    DDS_MessagesdoneOrder_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPluginSupport_destroy_data_ex(
    DDS_MessagesdoneOrder_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPluginSupport_destroy_data(
    DDS_MessagesdoneOrder_Messages *sample);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPluginSupport_print_data(
    const DDS_MessagesdoneOrder_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_MessagesdoneOrder_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_MessagesdoneOrder_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_MessagesdoneOrder_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_MessagesdoneOrder_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages *out,
    const DDS_MessagesdoneOrder_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesdoneOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesdoneOrder_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_MessagesdoneOrder_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesdoneOrder_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_MessagesdoneOrder_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_MessagesdoneOrder_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_MessagesdoneOrder_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_MessagesdoneOrder_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesdoneOrder_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesdoneOrder_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesdoneOrder_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesdoneOrder_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesdoneOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_MessagesdoneOrder_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_MessagesdoneOrder_MessagesPlugin_delete(struct PRESTypePlugin *);

#define DDS_MessagesnoOrder_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_MessagesnoOrder_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_MessagesnoOrder_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_MessagesnoOrder_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_MessagesnoOrder_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_MessagesnoOrder_Messages*
DDS_MessagesnoOrder_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_MessagesnoOrder_Messages*
DDS_MessagesnoOrder_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_MessagesnoOrder_Messages*
DDS_MessagesnoOrder_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPluginSupport_copy_data(
    DDS_MessagesnoOrder_Messages *out,
    const DDS_MessagesnoOrder_Messages *in);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPluginSupport_destroy_data_w_params(
    DDS_MessagesnoOrder_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPluginSupport_destroy_data_ex(
    DDS_MessagesnoOrder_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPluginSupport_destroy_data(
    DDS_MessagesnoOrder_Messages *sample);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPluginSupport_print_data(
    const DDS_MessagesnoOrder_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_MessagesnoOrder_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_MessagesnoOrder_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_MessagesnoOrder_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_MessagesnoOrder_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages *out,
    const DDS_MessagesnoOrder_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesnoOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesnoOrder_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_MessagesnoOrder_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesnoOrder_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_MessagesnoOrder_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_MessagesnoOrder_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_MessagesnoOrder_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_MessagesnoOrder_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesnoOrder_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesnoOrder_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesnoOrder_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesnoOrder_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesnoOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_MessagesnoOrder_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_MessagesnoOrder_MessagesPlugin_delete(struct PRESTypePlugin *);

#define DDS_MessagessimpleOrder_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_MessagessimpleOrder_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_MessagessimpleOrder_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_MessagessimpleOrder_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_MessagessimpleOrder_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_MessagessimpleOrder_Messages*
DDS_MessagessimpleOrder_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_MessagessimpleOrder_Messages*
DDS_MessagessimpleOrder_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_MessagessimpleOrder_Messages*
DDS_MessagessimpleOrder_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPluginSupport_copy_data(
    DDS_MessagessimpleOrder_Messages *out,
    const DDS_MessagessimpleOrder_Messages *in);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPluginSupport_destroy_data_w_params(
    DDS_MessagessimpleOrder_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPluginSupport_destroy_data_ex(
    DDS_MessagessimpleOrder_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPluginSupport_destroy_data(
    DDS_MessagessimpleOrder_Messages *sample);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPluginSupport_print_data(
    const DDS_MessagessimpleOrder_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_MessagessimpleOrder_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_MessagessimpleOrder_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_MessagessimpleOrder_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_MessagessimpleOrder_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages *out,
    const DDS_MessagessimpleOrder_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagessimpleOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagessimpleOrder_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_MessagessimpleOrder_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagessimpleOrder_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_MessagessimpleOrder_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_MessagessimpleOrder_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_MessagessimpleOrder_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_MessagessimpleOrder_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagessimpleOrder_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagessimpleOrder_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagessimpleOrder_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagessimpleOrder_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagessimpleOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_MessagessimpleOrder_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_MessagessimpleOrder_MessagesPlugin_delete(struct PRESTypePlugin *);

#define DDS_MessagesgetOrder_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_MessagesgetOrder_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_MessagesgetOrder_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_MessagesgetOrder_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_MessagesgetOrder_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_MessagesgetOrder_Messages*
DDS_MessagesgetOrder_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_MessagesgetOrder_Messages*
DDS_MessagesgetOrder_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_MessagesgetOrder_Messages*
DDS_MessagesgetOrder_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPluginSupport_copy_data(
    DDS_MessagesgetOrder_Messages *out,
    const DDS_MessagesgetOrder_Messages *in);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPluginSupport_destroy_data_w_params(
    DDS_MessagesgetOrder_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPluginSupport_destroy_data_ex(
    DDS_MessagesgetOrder_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPluginSupport_destroy_data(
    DDS_MessagesgetOrder_Messages *sample);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPluginSupport_print_data(
    const DDS_MessagesgetOrder_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_MessagesgetOrder_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_MessagesgetOrder_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_MessagesgetOrder_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_MessagesgetOrder_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages *out,
    const DDS_MessagesgetOrder_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesgetOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesgetOrder_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_MessagesgetOrder_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesgetOrder_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_MessagesgetOrder_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_MessagesgetOrder_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_MessagesgetOrder_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_MessagesgetOrder_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesgetOrder_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesgetOrder_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesgetOrder_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesgetOrder_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesgetOrder_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_MessagesgetOrder_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_MessagesgetOrder_MessagesPlugin_delete(struct PRESTypePlugin *);

#define DDS_MessagesorderForPS_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_MessagesorderForPS_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_MessagesorderForPS_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_MessagesorderForPS_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_MessagesorderForPS_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_MessagesorderForPS_Messages*
DDS_MessagesorderForPS_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_MessagesorderForPS_Messages*
DDS_MessagesorderForPS_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_MessagesorderForPS_Messages*
DDS_MessagesorderForPS_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPluginSupport_copy_data(
    DDS_MessagesorderForPS_Messages *out,
    const DDS_MessagesorderForPS_Messages *in);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPluginSupport_destroy_data_w_params(
    DDS_MessagesorderForPS_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPluginSupport_destroy_data_ex(
    DDS_MessagesorderForPS_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPluginSupport_destroy_data(
    DDS_MessagesorderForPS_Messages *sample);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPluginSupport_print_data(
    const DDS_MessagesorderForPS_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_MessagesorderForPS_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_MessagesorderForPS_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_MessagesorderForPS_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_MessagesorderForPS_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages *out,
    const DDS_MessagesorderForPS_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesorderForPS_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesorderForPS_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_MessagesorderForPS_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesorderForPS_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_MessagesorderForPS_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_MessagesorderForPS_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_MessagesorderForPS_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_MessagesorderForPS_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_MessagesorderForPS_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_MessagesorderForPS_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_MessagesorderForPS_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_MessagesorderForPS_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_MessagesorderForPS_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_MessagesorderForPS_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_MessagesorderForPS_MessagesPlugin_delete(struct PRESTypePlugin *);

#define DDS_Messagesheartbeat_MessagesPlugin_get_sample PRESTypePluginDefaultEndpointData_getSample 
#define DDS_Messagesheartbeat_MessagesPlugin_get_buffer PRESTypePluginDefaultEndpointData_getBuffer 
#define DDS_Messagesheartbeat_MessagesPlugin_return_buffer PRESTypePluginDefaultEndpointData_returnBuffer 

#define DDS_Messagesheartbeat_MessagesPlugin_create_sample PRESTypePluginDefaultEndpointData_createSample 
#define DDS_Messagesheartbeat_MessagesPlugin_destroy_sample PRESTypePluginDefaultEndpointData_deleteSample 

/* --------------------------------------------------------------------------------------
Support functions:
* -------------------------------------------------------------------------------------- */

NDDSUSERDllExport extern DDS_Messagesheartbeat_Messages*
DDS_Messagesheartbeat_MessagesPluginSupport_create_data_w_params(
    const struct DDS_TypeAllocationParams_t * alloc_params);

NDDSUSERDllExport extern DDS_Messagesheartbeat_Messages*
DDS_Messagesheartbeat_MessagesPluginSupport_create_data_ex(RTIBool allocate_pointers);

NDDSUSERDllExport extern DDS_Messagesheartbeat_Messages*
DDS_Messagesheartbeat_MessagesPluginSupport_create_data(void);

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPluginSupport_copy_data(
    DDS_Messagesheartbeat_Messages *out,
    const DDS_Messagesheartbeat_Messages *in);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPluginSupport_destroy_data_w_params(
    DDS_Messagesheartbeat_Messages *sample,
    const struct DDS_TypeDeallocationParams_t * dealloc_params);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPluginSupport_destroy_data_ex(
    DDS_Messagesheartbeat_Messages *sample,RTIBool deallocate_pointers);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPluginSupport_destroy_data(
    DDS_Messagesheartbeat_Messages *sample);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPluginSupport_print_data(
    const DDS_Messagesheartbeat_Messages *sample,
    const char *desc,
    unsigned int indent);

/* ----------------------------------------------------------------------------
Callback functions:
* ---------------------------------------------------------------------------- */

NDDSUSERDllExport extern PRESTypePluginParticipantData 
DDS_Messagesheartbeat_MessagesPlugin_on_participant_attached(
    void *registration_data, 
    const struct PRESTypePluginParticipantInfo *participant_info,
    RTIBool top_level_registration, 
    void *container_plugin_context,
    RTICdrTypeCode *typeCode);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPlugin_on_participant_detached(
    PRESTypePluginParticipantData participant_data);

NDDSUSERDllExport extern PRESTypePluginEndpointData 
DDS_Messagesheartbeat_MessagesPlugin_on_endpoint_attached(
    PRESTypePluginParticipantData participant_data,
    const struct PRESTypePluginEndpointInfo *endpoint_info,
    RTIBool top_level_registration, 
    void *container_plugin_context);

NDDSUSERDllExport extern void 
DDS_Messagesheartbeat_MessagesPlugin_on_endpoint_detached(
    PRESTypePluginEndpointData endpoint_data);

NDDSUSERDllExport extern void    
DDS_Messagesheartbeat_MessagesPlugin_return_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages *sample,
    void *handle);    

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_copy_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages *out,
    const DDS_Messagesheartbeat_Messages *in);

/* ----------------------------------------------------------------------------
(De)Serialize functions:
* ------------------------------------------------------------------------- */

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_serialize(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_Messagesheartbeat_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_deserialize_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages *sample, 
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_Messagesheartbeat_MessagesPlugin_serialize_to_cdr_buffer(
    char * buffer,
    unsigned int * length,
    const DDS_Messagesheartbeat_Messages *sample); 

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_deserialize(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages **sample, 
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_Messagesheartbeat_MessagesPlugin_deserialize_from_cdr_buffer(
    DDS_Messagesheartbeat_Messages *sample,
    const char * buffer,
    unsigned int length);    

NDDSUSERDllExport extern RTIBool
DDS_Messagesheartbeat_MessagesPlugin_skip(
    PRESTypePluginEndpointData endpoint_data,
    struct RTICdrStream *stream, 
    RTIBool skip_encapsulation,  
    RTIBool skip_sample, 
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern unsigned int 
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_sample_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);    

NDDSUSERDllExport extern unsigned int 
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_sample_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_sample_min_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_sample_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment,
    const DDS_Messagesheartbeat_Messages * sample);

/* --------------------------------------------------------------------------------------
Key Management functions:
* -------------------------------------------------------------------------------------- */
NDDSUSERDllExport extern PRESTypePluginKeyKind 
DDS_Messagesheartbeat_MessagesPlugin_get_key_kind(void);

NDDSUSERDllExport extern unsigned int 
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_key_max_size_ex(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool * overflow,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern unsigned int 
DDS_Messagesheartbeat_MessagesPlugin_get_serialized_key_max_size(
    PRESTypePluginEndpointData endpoint_data,
    RTIBool include_encapsulation,
    RTIEncapsulationId encapsulation_id,
    unsigned int current_alignment);

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_serialize_key(
    PRESTypePluginEndpointData endpoint_data,
    const DDS_Messagesheartbeat_Messages *sample,
    struct RTICdrStream *stream,
    RTIBool serialize_encapsulation,
    RTIEncapsulationId encapsulation_id,
    RTIBool serialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_deserialize_key_sample(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages * sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool 
DDS_Messagesheartbeat_MessagesPlugin_deserialize_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages ** sample,
    RTIBool * drop_sample,
    struct RTICdrStream *stream,
    RTIBool deserialize_encapsulation,
    RTIBool deserialize_key,
    void *endpoint_plugin_qos);

NDDSUSERDllExport extern RTIBool
DDS_Messagesheartbeat_MessagesPlugin_serialized_sample_to_key(
    PRESTypePluginEndpointData endpoint_data,
    DDS_Messagesheartbeat_Messages *sample,
    struct RTICdrStream *stream, 
    RTIBool deserialize_encapsulation,  
    RTIBool deserialize_key, 
    void *endpoint_plugin_qos);

/* Plugin Functions */
NDDSUSERDllExport extern struct PRESTypePlugin*
DDS_Messagesheartbeat_MessagesPlugin_new(void);

NDDSUSERDllExport extern void
DDS_Messagesheartbeat_MessagesPlugin_delete(struct PRESTypePlugin *);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

#endif /* MUML_DDSPlugin_1362043835_h */

