package productions.darthplagueis.roomwordsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class WordViewHolder extends RecyclerView.ViewHolder {

    private final TextView wordItemView;

    public WordViewHolder(View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.textView);
    }

    public void onBind(Word word) {
        wordItemView.setText(word.getWord());
    }
}
