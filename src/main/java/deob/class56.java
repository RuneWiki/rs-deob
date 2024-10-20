package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class56 extends class112 {

    @ObfuscatedName("bq.d")
    public AudioFormat field649;

    @ObfuscatedName("bq.q")
    public SourceDataLine field648;

    @ObfuscatedName("bq.x")
    public int field647;

    @ObfuscatedName("bq.y")
    public byte[] field650;

    @ObfuscatedName("bq.d(I)V")
    public void method704() {
        this.field649 = new AudioFormat((float) Statics.field1634, 16, Statics.field889 ? 2 : 1, true, false);
        this.field650 = new byte[0x100 << (Statics.field889 ? 2 : 1)];
    }

    @ObfuscatedName("bq.q(IB)V")
    public void method692(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field649, arg0 << (Statics.field889 ? 2 : 1));
            this.field648 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field648.open();
            this.field648.start();
            this.field647 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field648 = null;
                throw var11;
            } else {
                this.method692(class178.method228(arg0));
            }
        }
    }

    @ObfuscatedName("bq.x(B)I")
    public int method693() {
        return this.field647 - (this.field648.available() >> (Statics.field889 ? 2 : 1));
    }

    @ObfuscatedName("bq.y()V")
    public void method694() {
        int var1 = 256;
        if (Statics.field889) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1615[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field650[var2 * 2] = (byte) (var3 >> 8);
            this.field650[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field648.write(this.field650, 0, var1 << 1);
    }

    @ObfuscatedName("bq.e(I)V")
    public void method695() {
        if (this.field648 != null) {
            this.field648.close();
            this.field648 = null;
        }
    }

    @ObfuscatedName("bq.f(I)V")
    public void method708() {
        this.field648.flush();
    }
}
