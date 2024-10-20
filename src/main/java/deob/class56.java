package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class56 extends class109 {

    @ObfuscatedName("bl.m")
    public AudioFormat field638;

    @ObfuscatedName("bl.p")
    public SourceDataLine field637;

    @ObfuscatedName("bl.i")
    public int field639;

    @ObfuscatedName("bl.j")
    public byte[] field640;

    @ObfuscatedName("bl.m(I)V")
    public void method746() {
        this.field638 = new AudioFormat((float) Statics.field1554, 16, Statics.field1546 ? 2 : 1, true, false);
        this.field640 = new byte[0x100 << (Statics.field1546 ? 2 : 1)];
    }

    @ObfuscatedName("bl.p(II)V")
    public void method747(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field638, arg0 << (Statics.field1546 ? 2 : 1));
            this.field637 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field637.open();
            this.field637.start();
            this.field639 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field637 = null;
                throw var11;
            } else {
                this.method747(class185.method2904(arg0));
            }
        }
    }

    @ObfuscatedName("bl.i(I)I")
    public int method754() {
        return this.field639 - (this.field637.available() >> (Statics.field1546 ? 2 : 1));
    }

    @ObfuscatedName("bl.j()V")
    public void method749() {
        int var1 = 256;
        if (Statics.field1546) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1552[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field640[var2 * 2] = (byte) (var3 >> 8);
            this.field640[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field637.write(this.field640, 0, var1 << 1);
    }

    @ObfuscatedName("bl.v(I)V")
    public void method751() {
        if (this.field637 != null) {
            this.field637.close();
            this.field637 = null;
        }
    }

    @ObfuscatedName("bl.x(B)V")
    public void method758() {
        this.field637.flush();
    }
}
