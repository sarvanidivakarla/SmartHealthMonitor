<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#202020"
    android:padding="16dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center_horizontal">

        <!-- Title -->
        <TextView
            android:id="@+id/appTitle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Smart Health Monitoring"
            android:textSize="24sp"
            android:textColor="#FFFFFF"
            android:layout_marginBottom="24dp" />

        <!-- Watch Image in CardView -->
        <androidx.cardview.widget.CardView
            android:id="@+id/watchCard"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:layout_marginBottom="24dp"
            app:cardCornerRadius="16dp"
            app:cardElevation="8dp"
            >

            <ImageView
                android:id="@+id/watchImage"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:src="@drawable/watch_image"
                android:scaleType="fitCenter" />
        </androidx.cardview.widget.CardView>

        <!-- Heart Rate Card -->
        <androidx.cardview.widget.CardView
            android:id="@+id/heartRateCard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cardCornerRadius="12dp"
            app:cardElevation="8dp"
            android:backgroundTint="#808080"
            android:layout_marginBottom="16dp"
            android:padding="12dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">

                <ImageView
                    android:id="@+id/heartRateIcon"
                    android:layout_width="75dp"
                    android:layout_height="75dp"
                    android:src="@drawable/heart_icon"
                    android:layout_marginEnd="16dp" />

                <TextView
                    android:id="@+id/heartRateText"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dp"
                    android:paddingLeft="8dp"
                    android:paddingRight="15dp"
                    android:text="Heart Rate: -- bpm"
                    android:textColor="#FFFFFF"
                    android:textSize="20dp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Steps Card -->
        <androidx.cardview.widget.CardView
            android:id="@+id/stepsCard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cardCornerRadius="12dp"
            app:cardElevation="8dp"
            android:backgroundTint="#808080"
            android:layout_marginBottom="16dp"
            android:padding="12dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">

                <ImageView
                    android:id="@+id/stepsIcon"
                    android:layout_width="75dp"
                    android:layout_height="75dp"
                    android:src="@drawable/steps_icon"
                    android:layout_marginEnd="16dp" />

                <TextView
                    android:id="@+id/stepsText"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dp"
                    android:paddingLeft="8dp"
                    android:paddingRight="15dp"
                    android:text="Steps: --"
                    android:textColor="#FFFFFF"
                    android:textSize="20dp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- SpO2 Card -->
        <androidx.cardview.widget.CardView
            android:id="@+id/spo2Card"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cardCornerRadius="12dp"
            app:cardElevation="8dp"
            android:backgroundTint="#808080"
            android:layout_marginBottom="16dp"
            android:padding="12dp">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">

                <ImageView
                    android:id="@+id/spo2Icon"
                    android:layout_width="75dp"
                    android:layout_height="75dp"
                    android:src="@drawable/spo2_icon"
                    android:layout_marginEnd="16dp" />

                <TextView
                    android:id="@+id/oxyText"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dp"
                    android:paddingLeft="8dp"
                    android:paddingRight="15dp"
                    android:text="SpO2 level: --%"
                    android:textColor="#FFFFFF"
                    android:textSize="20dp" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

    </LinearLayout>
</ScrollView>
