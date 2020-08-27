package io.sealights.onpremise.agent.android

import io.sealights.onpremise.agents.android.spi.MethodDataProvider

class MethodDataProvider : MethodDataProvider {

    override fun get(): Array<Array<String>> {
        return arrayOf(
            arrayOf(
                "17 | public final V io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter\$1.onClick[Landroid/view/View;] | (Landroid/view/View;)V | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$1"
            ),
            arrayOf(
                "0 | V io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter\$1.<init>[Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter;] | (Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter;)V | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$1"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.getContent[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.component3[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Lio/sealights/android/example/dummy/DummyContent\$DummyItem; io.sealights.android.example.dummy.DummyContent\$DummyItem.copy[Ljava/lang/String;, Ljava/lang/String;, Ljava/lang/String;] | (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/sealights/android/example/dummy/DummyContent\$DummyItem; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "1 | public I io.sealights.android.example.dummy.DummyContent\$DummyItem.hashCode[] | ()I | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "1 | public Z io.sealights.android.example.dummy.DummyContent\$DummyItem.equals[Ljava/lang/Object;] | (Ljava/lang/Object;)Z | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "1 | public Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.toString[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.component1[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.component2[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.getDetails[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.dummy.DummyContent\$DummyItem.<init>[Ljava/lang/String;, Ljava/lang/String;, Ljava/lang/String;] | (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "17 | public final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent\$DummyItem.getId[] | ()Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent\$DummyItem"
            ),
            arrayOf(
                "18 | private final Ljava/lang/String; io.sealights.android.example.dummy.DummyContent.makeDetails[I] | (I)Ljava/lang/String; | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "17 | public final Ljava/util/List; io.sealights.android.example.dummy.DummyContent.getITEMS[] | ()Ljava/util/List; | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "17 | public final Ljava/util/Map; io.sealights.android.example.dummy.DummyContent.getITEM_MAP[] | ()Ljava/util/Map; | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "18 | private final Lio/sealights/android/example/dummy/DummyContent\$DummyItem; io.sealights.android.example.dummy.DummyContent.createDummyItem[I] | (I)Lio/sealights/android/example/dummy/DummyContent\$DummyItem; | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "2 | private V io.sealights.android.example.dummy.DummyContent.<init>[] | ()V | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "8 | static V io.sealights.android.example.dummy.DummyContent.<clinit>[] | ()V | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "18 | private final V io.sealights.android.example.dummy.DummyContent.addItem[Lio/sealights/android/example/dummy/DummyContent\$DummyItem;] | (Lio/sealights/android/example/dummy/DummyContent\$DummyItem;)V | null",
                "io/sealights/android/example/dummy/DummyContent"
            ),
            arrayOf(
                "1 | public V io.sealights.android.io.sealights.android.example.AndroidExampleApp.onCreate[] | ()V | null",
                "io/sealights/android/io/sealights/android/example/AndroidExampleApp"
            ),
            arrayOf(
                "1 | public V io.sealights.android.io.sealights.android.example.AndroidExampleApp.<init>[] | ()V | null",
                "io/sealights/android/io/sealights/android/example/AndroidExampleApp"
            ),
            arrayOf(
                "1 | public Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder; io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter.onCreateViewHolder[Landroid/view/ViewGroup;, I] | (Landroid/view/ViewGroup;I)Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder; | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter.<init>[Lio/sealights/android/example/ItemListActivity;, Ljava/util/List;, Z] | (Lio/sealights/android/example/ItemListActivity;Ljava/util/List;Z)V | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter"
            ),
            arrayOf(
                "1 | public I io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter.getItemCount[] | ()I | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter.onBindViewHolder[Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder;, I] | (Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder;I)V | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter"
            ),
            arrayOf(
                "4 | protected V io.sealights.android.example.ItemListActivity.onCreate[Landroid/os/Bundle;] | (Landroid/os/Bundle;)V | null",
                "io/sealights/android/example/ItemListActivity"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemListActivity._\$_clearFindViewByIdCache[] | ()V | null",
                "io/sealights/android/example/ItemListActivity"
            ),
            arrayOf(
                "18 | private final V io.sealights.android.example.ItemListActivity.setupRecyclerView[Landroidx/recyclerview/widget/RecyclerView;] | (Landroidx/recyclerview/widget/RecyclerView;)V | null",
                "io/sealights/android/example/ItemListActivity"
            ),
            arrayOf(
                "1 | public Landroid/view/View; io.sealights.android.example.ItemListActivity._\$_findCachedViewById[I] | (I)Landroid/view/View; | null",
                "io/sealights/android/example/ItemListActivity"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemListActivity.<init>[] | ()V | null",
                "io/sealights/android/example/ItemListActivity"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemDetailFragment.<init>[] | ()V | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "1 | public Landroid/view/View; io.sealights.android.example.ItemDetailFragment.onCreateView[Landroid/view/LayoutInflater;, Landroid/view/ViewGroup;, Landroid/os/Bundle;] | (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View; | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemDetailFragment._\$_clearFindViewByIdCache[] | ()V | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemDetailFragment.onCreate[Landroid/os/Bundle;] | (Landroid/os/Bundle;)V | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "8 | static V io.sealights.android.example.ItemDetailFragment.<clinit>[] | ()V | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "1 | public Landroid/view/View; io.sealights.android.example.ItemDetailFragment._\$_findCachedViewById[I] | (I)Landroid/view/View; | null",
                "io/sealights/android/example/ItemDetailFragment"
            ),
            arrayOf(
                "17 | public final Landroid/widget/TextView; io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder.getContentView[] | ()Landroid/widget/TextView; | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder"
            ),
            arrayOf(
                "17 | public final Landroid/widget/TextView; io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder.getIdView[] | ()Landroid/widget/TextView; | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder.<init>[Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter;, Landroid/view/View;] | (Lio/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter;Landroid/view/View;)V | null",
                "io/sealights/android/example/ItemListActivity\$SimpleItemRecyclerViewAdapter\$ViewHolder"
            ),
            arrayOf(
                "8 | static V io.sealights.android.example.ItemListActivity\$onCreate\$1.<clinit>[] | ()V | null",
                "io/sealights/android/example/ItemListActivity\$onCreate\$1"
            ),
            arrayOf(
                "17 | public final V io.sealights.android.example.ItemListActivity\$onCreate\$1.onClick[Landroid/view/View;] | (Landroid/view/View;)V | null",
                "io/sealights/android/example/ItemListActivity\$onCreate\$1"
            ),
            arrayOf(
                "0 | V io.sealights.android.example.ItemListActivity\$onCreate\$1.<init>[] | ()V | null",
                "io/sealights/android/example/ItemListActivity\$onCreate\$1"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.BuildConfig.<init>[] | ()V | null",
                "io/sealights/android/example/BuildConfig"
            ),
            arrayOf(
                "8 | static V io.sealights.android.example.BuildConfig.<clinit>[] | ()V | null",
                "io/sealights/android/example/BuildConfig"
            ),
            arrayOf(
                "2 | private V io.sealights.android.example.ItemDetailFragment\$Companion.<init>[] | ()V | null",
                "io/sealights/android/example/ItemDetailFragment\$Companion"
            ),
            arrayOf(
                "1 | public Z io.sealights.android.example.ItemDetailActivity.onOptionsItemSelected[Landroid/view/MenuItem;] | (Landroid/view/MenuItem;)Z | null",
                "io/sealights/android/example/ItemDetailActivity"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemDetailActivity._\$_clearFindViewByIdCache[] | ()V | null",
                "io/sealights/android/example/ItemDetailActivity"
            ),
            arrayOf(
                "4 | protected V io.sealights.android.example.ItemDetailActivity.onCreate[Landroid/os/Bundle;] | (Landroid/os/Bundle;)V | null",
                "io/sealights/android/example/ItemDetailActivity"
            ),
            arrayOf(
                "1 | public V io.sealights.android.example.ItemDetailActivity.<init>[] | ()V | null",
                "io/sealights/android/example/ItemDetailActivity"
            ),
            arrayOf(
                "1 | public Landroid/view/View; io.sealights.android.example.ItemDetailActivity._\$_findCachedViewById[I] | (I)Landroid/view/View; | null",
                "io/sealights/android/example/ItemDetailActivity"
            ),
            arrayOf(
                "17 | public final V io.sealights.android.example.ItemDetailActivity\$onCreate\$1.onClick[Landroid/view/View;] | (Landroid/view/View;)V | null",
                "io/sealights/android/example/ItemDetailActivity\$onCreate\$1"
            ),
            arrayOf(
                "0 | V io.sealights.android.example.ItemDetailActivity\$onCreate\$1.<init>[] | ()V | null",
                "io/sealights/android/example/ItemDetailActivity\$onCreate\$1"
            ),
            arrayOf(
                "8 | static V io.sealights.android.example.ItemDetailActivity\$onCreate\$1.<clinit>[] | ()V | null",
                "io/sealights/android/example/ItemDetailActivity\$onCreate\$1"
            )
        )
    }

    companion object {
        fun indexOf(uniqueId: String): Int {
            val methods = MethodDataProvider()
                .get().withIndex()
            for ((index, method) in methods) {
                if (method[0] == uniqueId) {
                    return index
                }
            }
            return -1
        }
    }



}