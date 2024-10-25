package com.example.cc17_3f_ducusintjd_act6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_ducusintjd_act6.adapter.DaysAdapter
import com.example.cc17_3f_ducusintjd_act6.model.Days

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val daysRecView: RecyclerView = findViewById(R.id.daysRecView)
        daysRecView.layoutManager = LinearLayoutManager(this)

        val dayList = listOf(
            Days("Day 1", "Rule of Thirds", R.drawable.ruleofthirds, "Take photos using the rule of thirds to improve balance in your compositions."),
            Days("Day 2", "Leading Lines", R.drawable.leadinglines, "Capture images that use leading lines to draw attention to your subject."),
            Days("Day 3", "Symmetry & Patterns", R.drawable.symmetryandpatterns, "Photograph subjects with strong symmetry or repeating patterns."),
            Days("Day 4", "Framing", R.drawable.framing, "Use natural objects like windows, doors, or trees to frame your subject."),
            Days("Day 5", "Perspective", R.drawable.perspective, "Experiment with unusual angles (high, low, wide) to change the viewer's perspective."),
            Days("Day 6", "Negative Space", R.drawable.negativespace, "Focus on creating a minimalist image by using negative space to emphasize your subject."),
            Days("Day 7", "Fill the Frame", R.drawable.filltheframe, "Take close-up shots, filling the entire frame with your subject to eliminate distractions."),
            Days("Day 8", "Natural Light", R.drawable.naturallight, "Photograph outdoors using only natural light. Experiment with different times of the day."),
            Days("Day 9", "Golden Hour", R.drawable.goldenhour, "Shoot during the golden hour (just after sunrise or before sunset) for warm, soft lighting."),
            Days("Day 10", "Silhouettes", R.drawable.silhouettes, "Capture a silhouette by placing your subject in front of a light source."),
            Days("Day 11", "Low Light/Night Photography", R.drawable.lowlightnight, "Practice shooting in low light or at night, using long exposure or a tripod."),
            Days("Day 12", "Shadows and Reflections", R.drawable.shadowsandreflections, "Create artistic images focusing on shadows or reflections in water or glass."),
            Days("Day 13", "Flash Photography", R.drawable.flashphotography, "Experiment with on-camera or off-camera flash to understand lighting control."),
            Days("Day 14", "Overexposure & Underexposure", R.drawable.overandunderexposure, "Intentionally overexpose and underexpose shots to see how it affects mood and detail."),
            Days("Day 15", "Motion Blur", R.drawable.motionblur, "Capture movement with intentional motion blur (e.g., moving cars, people walking)."),
            Days("Day 16", "Freeze Motion", R.drawable.freezemotion, "Use fast shutter speed to freeze action (e.g., water splash, jumping)."),
            Days("Day 17", "Macro Photography", R.drawable.macrophotography, "Take close-up shots of small subjects (flowers, insects, textures)."),
            Days("Day 18", "Black and White", R.drawable.blackandwhite, "Shoot in black and white, focusing on contrast, texture, and light."),
            Days("Day 19", "Depth of Field (Bokeh)", R.drawable.depthoffield, "Play with aperture to achieve shallow or deep depth of field (blurry background vs. sharp)."),
            Days("Day 20", "Panning Technique", R.drawable.panning, "Practice panning (moving the camera with a moving subject) to create motion in the background."),
            Days("Day 21", "HDR (High Dynamic Range)", R.drawable.hdr, "Take several exposures of the same scene and combine them for high contrast in light and shadows."),
            Days("Day 22", "Portraits", R.drawable.portrait, "Take natural, candid, or posed portraits of a person, focusing on lighting and expression."),
            Days("Day 23", "Landscape Photography", R.drawable.landscape, "Capture a wide, scenic landscape, emphasizing composition and lighting."),
            Days("Day 24", "Architecture & Buildings", R.drawable.architectureandbuildings, "Photograph interesting architecture with attention to lines and symmetry."),
            Days("Day 25", "Street Photography", R.drawable.streetphotography, "Document life on the streets, capturing spontaneous moments or interesting characters."),
            Days("Day 26", "Still Life", R.drawable.stilllife, "Arrange objects in a creative way and capture a still-life photo with attention to detail and composition."),
            Days("Day 27", "Storytelling in Photos", R.drawable.storytelling, "Create a series of 3-5 photos that tell a story or convey a message."),
            Days("Day 28", "Abstract Photography", R.drawable.resource_abstract, "Get creative with shapes, patterns, and textures to create abstract photos."),
            Days("Day 29", "Long Exposure", R.drawable.longexposure, "Experiment with long exposure photography (e.g., light trails, flowing water)."),
            Days("Day 30", "Personal Style", R.drawable.personalstyle, "End the challenge by revisiting a previous technique and putting your unique spin on it.")

        )

        daysRecView.adapter = DaysAdapter(dayList)

    }
}