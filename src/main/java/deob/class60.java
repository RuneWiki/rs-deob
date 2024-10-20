package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class60 extends class115 {

    @ObfuscatedName("bc.n")
    public AudioFormat field446;

    @ObfuscatedName("bc.v")
    public SourceDataLine field447;

    @ObfuscatedName("bc.d")
    public int field449;

    @ObfuscatedName("bc.c")
    public byte[] field448;

    @ObfuscatedName("bc.n(B)V")
    public void method824() {
        this.field446 = new AudioFormat((float) Statics.field3339, 16, Statics.field1432 ? 2 : 1, true, false);
        this.field448 = new byte[0x100 << (Statics.field1432 ? 2 : 1)];
    }

    @ObfuscatedName("bc.v(II)V")
    public void method805(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field446, arg0 << (Statics.field1432 ? 2 : 1));
            this.field447 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field447.open();
            this.field447.start();
            this.field449 = arg0;
        } catch (LineUnavailableException var4) {
            if (class198.method5622(arg0) == 1) {
                this.field447 = null;
                throw var4;
            } else {
                this.method805(class198.method3190(arg0));
            }
        }
    }

    @ObfuscatedName("bc.d(S)I")
    public int method806() {
        return this.field449 - (this.field447.available() >> (Statics.field1432 ? 2 : 1));
    }

    @ObfuscatedName("bc.c()V")
    public void method807() {
        int var1 = 256;
        if (Statics.field1432) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1423[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field448[var2 * 2] = (byte) (var3 >> 8);
            this.field448[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field447.write(this.field448, 0, var1 << 1);
    }

    @ObfuscatedName("bc.y(B)V")
    public void method808() {
        if (this.field447 != null) {
            this.field447.close();
            this.field447 = null;
        }
    }

    @ObfuscatedName("bc.h(I)V")
    public void method809() {
        this.field447.flush();
    }
}
