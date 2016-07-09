package filipelipan.com.github.smellslikebacon;

/**
 * Created by lispa on 21/06/2016.
 */
public class ListAdapter extends RecyclerAdapter {

    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onRecipeSelected(int adapterPosition) {
        mListener.onListRecipeSelected(adapterPosition);
    }
}
