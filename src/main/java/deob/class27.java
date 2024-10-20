package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ae")
public class class27 extends class38 {

    @ObfuscatedName("ae.v")
    public AudioFormat field165;

    @ObfuscatedName("ae.c")
    public SourceDataLine field164;

    @ObfuscatedName("ae.i")
    public int field166;

    @ObfuscatedName("ae.f")
    public byte[] field167;

    @ObfuscatedName("ae.v(I)V")
    public void method357() {
        this.field165 = new AudioFormat((float) Statics.field269, 16, Statics.field271 ? 2 : 1, true, false);
        this.field167 = new byte[0x100 << (Statics.field271 ? 2 : 1)];
    }

    @ObfuscatedName("ae.c(II)V")
    public void method358(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field165, arg0 << (Statics.field271 ? 2 : 1));
            this.field164 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field164.open();
            this.field164.start();
            this.field166 = arg0;
        } catch (LineUnavailableException var4) {
            if (class272.method2859(arg0) == 1) {
                this.field164 = null;
                throw var4;
            } else {
                this.method358(class272.method1825(arg0));
            }
        }
    }

    @ObfuscatedName("ae.i(I)I")
    public int method370() {
        return this.field166 - (this.field164.available() >> (Statics.field271 ? 2 : 1));
    }

    @ObfuscatedName("ae.f()V")
    public void method360() {
        int var1 = 256;
        if (Statics.field271) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field289[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field167[var2 * 2] = (byte) (var3 >> 8);
            this.field167[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field164.write(this.field167, 0, var1 << 1);
    }

    @ObfuscatedName("ae.b(I)V")
    public void method356() {
        if (this.field164 != null) {
            this.field164.close();
            this.field164 = null;
        }
    }

    @ObfuscatedName("ae.n(I)V")
    public void method371() {
        this.field164.flush();
    }
}
