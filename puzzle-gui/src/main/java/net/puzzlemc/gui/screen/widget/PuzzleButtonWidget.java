package net.puzzlemc.gui.screen.widget;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.util.function.Supplier;

public class PuzzleButtonWidget extends ButtonWidget {
    private final PuzzleWidget.TextAction title;

    public PuzzleButtonWidget(int x, int y, int width, int height, PuzzleWidget.TextAction title, PressAction onPress) {
        super(x, y, width, height, Text.of(""), onPress, Supplier::get);
        this.title = title;
    }
    @Override
    public void renderButton(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        title.setTitle(this);
        super.renderButton(matrices, mouseX, mouseY, delta);
    }
}
