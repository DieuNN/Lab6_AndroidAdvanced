package com.example.labb6_androidadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labb6_androidadvanced.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class LocateFPTPolyActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locate_fptpoly)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map2) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val FPTPoly = LatLng(21.038187854213614, 105.74677637185616)
        mMap.addMarker(MarkerOptions().position(FPTPoly).title("Marker in FPT Poly"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FPTPoly))
    }
}