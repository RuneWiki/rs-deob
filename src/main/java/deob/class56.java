package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bm")
public class class56 extends class109 {

    @ObfuscatedName("bm.s")
    public AudioFormat field637;

    @ObfuscatedName("bm.g")
    public SourceDataLine field635;

    @ObfuscatedName("bm.m")
    public int field634;

    @ObfuscatedName("bm.h")
    public byte[] field636;

    @ObfuscatedName("bm.s(I)V")
    public void method664() {
        this.field637 = new AudioFormat((float) Statics.field1562, 16, Statics.field1179 ? 2 : 1, true, false);
        this.field636 = new byte[0x100 << (Statics.field1179 ? 2 : 1)];
    }

    @ObfuscatedName("bm.g(II)V")
    public void method665(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field637, arg0 << (Statics.field1179 ? 2 : 1));
            this.field635 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field635.open();
            this.field635.start();
            this.field634 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field635 = null;
                throw var11;
            } else {
                this.method665(class189.method3203(arg0));
            }
        }
    }

    @ObfuscatedName("bm.m(I)I")
    public int method666() {
        return this.field634 - (this.field635.available() >> (Statics.field1179 ? 2 : 1));
    }

    @ObfuscatedName("bm.h()V")
    public void method663() {
        int var1 = 256;
        if (Statics.field1179) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1545[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field636[var2 * 2] = (byte) (var3 >> 8);
            this.field636[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field635.write(this.field636, 0, var1 << 1);
    }

    @ObfuscatedName("bm.i(I)V")
    public void method668() {
        if (this.field635 != null) {
            this.field635.close();
            this.field635 = null;
        }
    }

    @ObfuscatedName("bm.w(I)V")
    public void method676() {
        this.field635.flush();
    }
}
