package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class56 extends class111 {

    @ObfuscatedName("ba.e")
    public AudioFormat field660;

    @ObfuscatedName("ba.n")
    public SourceDataLine field658;

    @ObfuscatedName("ba.g")
    public int field657;

    @ObfuscatedName("ba.y")
    public byte[] field659;

    @ObfuscatedName("ba.e(B)V")
    public void method708() {
        this.field660 = new AudioFormat((float) Statics.field1618, 16, Statics.field375 ? 2 : 1, true, false);
        this.field659 = new byte[0x100 << (Statics.field375 ? 2 : 1)];
    }

    @ObfuscatedName("ba.n(II)V")
    public void method698(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field660, arg0 << (Statics.field375 ? 2 : 1));
            this.field658 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field658.open();
            this.field658.start();
            this.field657 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field658 = null;
                throw var11;
            } else {
                this.method698(class179.method75(arg0));
            }
        }
    }

    @ObfuscatedName("ba.g(B)I")
    public int method699() {
        return this.field657 - (this.field658.available() >> (Statics.field375 ? 2 : 1));
    }

    @ObfuscatedName("ba.y()V")
    public void method704() {
        int var1 = 256;
        if (Statics.field375) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1631[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field659[var2 * 2] = (byte) (var3 >> 8);
            this.field659[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field658.write(this.field659, 0, var1 << 1);
    }

    @ObfuscatedName("ba.w(B)V")
    public void method701() {
        if (this.field658 != null) {
            this.field658.close();
            this.field658 = null;
        }
    }

    @ObfuscatedName("ba.k(I)V")
    public void method697() {
        this.field658.flush();
    }
}
