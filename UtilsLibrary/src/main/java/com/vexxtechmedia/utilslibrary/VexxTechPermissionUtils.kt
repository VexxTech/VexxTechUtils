package com.vexxtechmedia.utilslibrary

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

object VexxTechPermissionUtils {

    const val WAKE_LOCK_PERMISSIONS = 0
    const val WRITE_EXTERNAL_STORAGE_PERMISSIONS = 1
    const val ACCESS_NETWORK_STATE_PERMISSIONS = 2
    const val INTERNET_PERMISSIONS = 3
    const val CAMERA_PERMISSIONS = 4
    const val READ_PHONE_STATE_PERMISSIONS = 5
    const val RECORD_AUDIO_PERMISSIONS = 6
    const val CHANGE_WIFI_STATE_PERMISSIONS = 7
    const val ACCESS_WIFI_STATE_PERMISSIONS = 8
    const val ACCESS_FINE_LOCATION_PERMISSIONS = 9
    const val MODIFY_AUDIO_PERMISSIONS = 10

    fun hasWakeLockPermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.WAKE_LOCK)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasWriteExternalStoragePermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasAccessNetworkStatePermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_NETWORK_STATE)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasInternetPermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.INTERNET)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasCameraPermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasReadPhoneStatePermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasRecordAudioPermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasChangeWiFiStatePermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.CHANGE_WIFI_STATE)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasAccessWiFiStatePermissions(context: Context): Boolean {
        val result: Int = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_WIFI_STATE)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasAccessFineLocationStatePermissions(context: Context): Boolean {
        val result = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)

        return result == PackageManager.PERMISSION_GRANTED
    }

    fun hasModifyAudioSettingsPermissions(context: Context): Boolean {
        val result = ContextCompat.checkSelfPermission(context, Manifest.permission.MODIFY_AUDIO_SETTINGS)

        return result == PackageManager.PERMISSION_GRANTED
    }
}