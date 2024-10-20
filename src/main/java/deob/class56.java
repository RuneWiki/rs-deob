package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bh")
public class class56 extends class110 {

    @ObfuscatedName("bh.c")
    public AudioFormat field672;

    @ObfuscatedName("bh.o")
    public SourceDataLine field671;

    @ObfuscatedName("bh.i")
    public int field673;

    @ObfuscatedName("bh.u")
    public byte[] field674;

    @ObfuscatedName("bh.c(I)V")
    public void method675() {
        this.field672 = new AudioFormat((float) Statics.field1276, 16, Statics.field234 ? 2 : 1, true, false);
        this.field674 = new byte[0x100 << (Statics.field234 ? 2 : 1)];
    }

    @ObfuscatedName("bh.o(IB)V")
    public void method665(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field672, arg0 << (Statics.field234 ? 2 : 1));
            this.field671 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field671.open();
            this.field671.start();
            this.field673 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method1500(arg0) == 1) {
                this.field671 = null;
                throw var4;
            } else {
                this.method665(class178.method522(arg0));
            }
        }
    }

    @ObfuscatedName("bh.i(I)I")
    public int method664() {
        return this.field673 - (this.field671.available() >> (Statics.field234 ? 2 : 1));
    }

    @ObfuscatedName("bh.u()V")
    public void method677() {
        int var1 = 256;
        if (Statics.field234) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1610[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field674[var2 * 2] = (byte) (var3 >> 8);
            this.field674[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field671.write(this.field674, 0, var1 << 1);
    }

    @ObfuscatedName("bh.g(I)V")
    public void method667() {
        if (this.field671 != null) {
            this.field671.close();
            this.field671 = null;
        }
    }

    @ObfuscatedName("bh.m(B)V")
    public void method672() {
        this.field671.flush();
    }
}
