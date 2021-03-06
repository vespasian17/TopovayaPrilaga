package solutions.vladik.topovayaprilaga.Story_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import solutions.vladik.topovayaprilaga.R;
import solutions.vladik.topovayaprilaga.ViewPagerAdapter;

public class Story_1 extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_1);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("KACHESTVO");
        setSupportActionBar(toolbar);
        setupNavView();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);



    }
    public void setupNavView(){
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                //.withAccountHeader(headerResult)
                .withTranslucentStatusBar(true)
                .withActionBarDrawerToggleAnimated(true)
                .withSliderBackgroundColor(Color.DKGRAY)
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName("Раздел 1")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music))
                                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                                    @Override
                                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                                        return false;
                                    }
                                }),
                        new PrimaryDrawerItem()
                                .withName("Раздел 2")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music)),
                        new PrimaryDrawerItem()
                                .withName("Раздел 3")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music)),
                        new DividerDrawerItem(),

                        new PrimaryDrawerItem()
                                .withName("Google Drive")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music)),
                        new DividerDrawerItem(),

                        new PrimaryDrawerItem()
                                .withName("Version")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music)),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName("Раздел 10: ").withSelectable(false).withTextColor(Color.WHITE),
                        new PrimaryDrawerItem()
                                .withName("Подраздел 1.pdf")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music)),
                        new PrimaryDrawerItem()
                                .withName("Подраздел 2.png")
                                .withTextColor(Color.WHITE)
                                .withSelectedTextColor(Color.WHITE)
                                .withSelectedColor(getResources().getColor(R.color.selectedNaw))
                                .withIcon(getResources().getDrawable(R.drawable.library_music))
                )
                .build();
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Качество");
        adapter.addFragment(new SecondFragment(), "Страница");
        adapter.addFragment(new FirstFragment(), "Уверенность");
        viewPager.setAdapter(adapter);
    }
}
