package io.sealights.android.example.dummy

import io.sealights.onpremise.agent.android.MethodDataProvider
import io.sealights.onpremise.agents.android.SeaLights
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        SeaLights.reportMethodHit(MethodDataProvider.indexOf("8 | static V io.sealights.android.example.dummy.DummyContent.<clinit>[] | ()V | null"))
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        SeaLights.reportMethodHit(MethodDataProvider.indexOf("18 | private final V io.sealights.android.example.dummy.DummyContent.addItem[Lio/sealights/android/example/dummy/DummyContent\$DummyItem;] | (Lio/sealights/android/example/dummy/DummyContent\$DummyItem;)V | null"))
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        SeaLights.reportMethodHit(MethodDataProvider.indexOf("18 | private final Lio/sealights/android/example/dummy/DummyContent\$DummyItem; io.sealights.android.example.dummy.DummyContent.createDummyItem[I] | (I)Lio/sealights/android/example/dummy/DummyContent\$DummyItem; | null"))
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        SeaLights.reportMethodHit(MethodDataProvider.indexOf("18 | private final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent.makeDetails[I] | (I)Ljava/lang/String; | null"))
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String {
            SeaLights.reportMethodHit(MethodDataProvider.indexOf("1 | public Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.toString[] | ()Ljava/lang/String; | null"))
            return content
        }
    }
}