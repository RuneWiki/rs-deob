package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ag")
public class class27 extends class38 {

    @ObfuscatedName("ag.i")
    public AudioFormat field152;

    @ObfuscatedName("ag.w")
    public SourceDataLine field149;

    @ObfuscatedName("ag.s")
    public int field151;

    @ObfuscatedName("ag.a")
    public byte[] field150;

    @ObfuscatedName("ag.i(B)V")
    public void method367() {
        this.field152 = new AudioFormat((float) Statics.field4360, 16, Statics.field263 ? 2 : 1, true, false);
        this.field150 = new byte[0x100 << (Statics.field263 ? 2 : 1)];
    }

    @ObfuscatedName("ag.w(II)V")
    public void method377(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field152, arg0 << (Statics.field263 ? 2 : 1));
            this.field149 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field149.open();
            this.field149.start();
            this.field151 = arg0;
        } catch (LineUnavailableException var11) {
            if (class246.method3747(arg0) == 1) {
                this.field149 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method377(var10);
        }
    }

    @ObfuscatedName("ag.s(I)I")
    public int method369() {
        return this.field151 - (this.field149.available() >> (Statics.field263 ? 2 : 1));
    }

    @ObfuscatedName("ag.a()V")
    public void method370() {
        int var1 = 256;
        if (Statics.field263) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field253[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field150[var2 * 2] = (byte) (var3 >> 8);
            this.field150[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field149.write(this.field150, 0, var1 << 1);
    }

    @ObfuscatedName("ag.o(I)V")
    public void method371() {
        if (this.field149 != null) {
            this.field149.close();
            this.field149 = null;
        }
    }

    @ObfuscatedName("ag.g(B)V")
    public void method381() {
        this.field149.flush();
    }
}
