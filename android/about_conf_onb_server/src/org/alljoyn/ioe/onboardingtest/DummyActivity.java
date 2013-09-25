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
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

/**
 * This activity shows no UI. It serves the purpose of starting the MPQService by the user. As of Android 3.0,
 * Services cannot be started from BOOT_COMPLETE Intent unless app had previously been explicitly started by the user.
 */
public class DummyActivity extends Activity
{
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
        Intent serviceIntent = new Intent(getApplicationContext(), OnboardingServer.class);
        getApplicationContext().startService(serviceIntent);
        // exit this activity after service was started
        finish();
	}
}
