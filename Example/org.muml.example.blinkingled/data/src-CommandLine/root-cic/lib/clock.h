/*********************************************************************************
 * Copyright (c) 2012 Solunar GmbH and others.
 * All rights reserved.
 *
 * Contributors:
 *     Solunar GmbH and others - initial API and implementation
 *******************************************************************************/
/**
 * @file
 * @author Solunar
 * @brief This file specifies how Clocks are read for a specific Target Platform
 * @details The function to read and set Clocks are defined as Preprocessor MACROS
 * @warning This needs to be adapted for specific Target Platforms
 */
#ifndef CLOCK_H_
#define CLOCK_H_
#include "../Middleware/OS.h"


#ifdef NXTOSEK
#include "ecrobot_interface.h"
#include <time.h>
typedef long Clock;
#define Clock_getTime(aClock) (  (systick_get_ms() - (aClock)) )

#define Clock_reset(aClock) ((aClock) = systick_get_ms())
#endif /* NXTOSEK */

#ifdef C99
#include <time.h>
typedef long Clock;
#define Clock_getTime(aClock) ( (CLOCKS_PER_SEC == 1000) ? (clock() - (aClock)) : ((clock() - (aClock)) * 1000 / CLOCKS_PER_SEC) )

#define Clock_reset(aClock) ((aClock) = clock())
#endif /* C99 */

#ifdef ARDUINO
#include "Arduino.h"
typedef long Clock;
#define Clock_getTime(aClock) (  (millis() - (aClock)) )

#define Clock_reset(aClock) ((aClock) = millis())
#endif /* C99 */


#endif /* CLOCK_H_ */
