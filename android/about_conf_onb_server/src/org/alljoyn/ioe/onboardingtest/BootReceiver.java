/******************************************************************************
* Copyright 2013, Qualcomm Innovation Center, Inc.
*
*    All rights reserved.
*    This file is licensed under the 3-clause BSD license in the NOTICE.txt
*    file for this project. A copy of the 3-clause BSD license is found at:
*
*        http://opensource.org/licenses/BSD-3-Clause. 
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the license is distributed on an "AS IS" BASIS,
*    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*    See the license for the specific language governing permissions and
*    limitations under the license.
******************************************************************************/
package org.alljoyn.ioe.onboardingtest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * This BroadcastReceiver reacts to a BOOT_COMPLETED intent, starting the service after device boot.
 */
public class BootReceiver extends BroadcastReceiver
{
	public BootReceiver()
	{
	}

	/* (non-Javadoc)
	 * @see android.content.BroadcastReceiver#onReceive(android.content.Context, android.content.Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent)
	{
		if("android.intent.action.BOOT_COMPLETED".equalsIgnoreCase(intent.getAction()))
		{
			Log.d("BootReceiver", "onReceive(android.intent.action.BOOT_COMPLETED). starting OnboardingService");
	        Intent serviceIntent = new Intent(context, OnboardingServer.class);
	        context.startService(serviceIntent); 
		}
	}
}
