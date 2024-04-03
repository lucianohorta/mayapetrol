package com.mayaiconsdark.app

import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsHqJVFfZMnKK7sWgks9Txvk2AdtEKWrrfuotnH5YYyJK+UtVzYE1cr9dAFFNryCaWXcr0SDY1JhgFnXZavXq8FI180XP0k+i3bu2gWSwhl3lFpopugaikk9dVxX7UhCefacw4ARMwycO/Jlt6QLs5Mx02DmZPFsGTfMeCNTtVnQysqLjCuH9dOH/cwKLSmrg+KGk65N7KjJ83z/5HjKrHxPUvbdfpRoCVnytLl8XzlrqerVBcBfdsrTUdsqyDDW6DnlR/hLacnzcTVM9fQJZM7nHxXJMCDH62j+hvmWe794i1V3fR2frjobzUVhQghtteu6Qp6UTTIbd/sxaSs72MQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null // Just for CI purposes
        // return if (BuildConfig.DEBUG) null
        // else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    override fun defaultMaterialYouTheme(): Int = R.style.MyApp_Default_MaterialYou
    override fun amoledMaterialYouTheme(): Int = R.style.MyApp_Default_Amoled_MaterialYou
}


