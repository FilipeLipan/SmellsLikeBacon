package filipelipan.com.github.smellslikebacon;

/**
 * Created by lispa on 25/06/2016.
 */
public class DirectionsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
