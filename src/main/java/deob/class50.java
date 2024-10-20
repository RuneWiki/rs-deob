package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ai")
public class class50 extends class104 {

    @ObfuscatedName("ai.f")
    public AudioFormat field409;

    @ObfuscatedName("ai.i")
    public SourceDataLine field407;

    @ObfuscatedName("ai.y")
    public int field408;

    @ObfuscatedName("ai.w")
    public byte[] field406;

    @ObfuscatedName("ai.f(B)V")
    public void method724() {
        this.field409 = new AudioFormat((float) Statics.field2491, 16, Statics.field1409 ? 2 : 1, true, false);
        this.field406 = new byte[0x100 << (Statics.field1409 ? 2 : 1)];
    }

    @ObfuscatedName("ai.i(II)V")
    public void method731(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field409, arg0 << (Statics.field1409 ? 2 : 1));
            this.field407 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field407.open();
            this.field407.start();
            this.field408 = arg0;
        } catch (LineUnavailableException var11) {
            if (class190.method968(arg0) == 1) {
                this.field407 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method731(var10);
        }
    }

    @ObfuscatedName("ai.y(I)I")
    public int method727() {
        return this.field408 - (this.field407.available() >> (Statics.field1409 ? 2 : 1));
    }

    @ObfuscatedName("ai.w()V")
    public void method728() {
        int var1 = 256;
        if (Statics.field1409) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1371[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field406[var2 * 2] = (byte) (var3 >> 8);
            this.field406[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field407.write(this.field406, 0, var1 << 1);
    }

    @ObfuscatedName("ai.p(S)V")
    public void method726() {
        if (this.field407 != null) {
            this.field407.close();
            this.field407 = null;
        }
    }

    @ObfuscatedName("ai.b(I)V")
    public void method744() {
        this.field407.flush();
    }
}
