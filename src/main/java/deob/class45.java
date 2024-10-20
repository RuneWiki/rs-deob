package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ar")
public class class45 extends class98 {

    @ObfuscatedName("ar.c")
    public AudioFormat field408;

    @ObfuscatedName("ar.q")
    public SourceDataLine field407;

    @ObfuscatedName("ar.m")
    public int field409;

    @ObfuscatedName("ar.j")
    public byte[] field410;

    @ObfuscatedName("ar.c(I)V")
    public void method681() {
        this.field408 = new AudioFormat((float) Statics.field2434, 16, Statics.field1375 ? 2 : 1, true, false);
        this.field410 = new byte[0x100 << (Statics.field1375 ? 2 : 1)];
    }

    @ObfuscatedName("ar.q(II)V")
    public void method679(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field408, arg0 << (Statics.field1375 ? 2 : 1));
            this.field407 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field407.open();
            this.field407.start();
            this.field409 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field407 = null;
                throw var11;
            } else {
                this.method679(class190.method2942(arg0));
            }
        }
    }

    @ObfuscatedName("ar.m(B)I")
    public int method682() {
        return this.field409 - (this.field407.available() >> (Statics.field1375 ? 2 : 1));
    }

    @ObfuscatedName("ar.j()V")
    public void method683() {
        int var1 = 256;
        if (Statics.field1375) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1358[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field410[var2 * 2] = (byte) (var3 >> 8);
            this.field410[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field407.write(this.field410, 0, var1 << 1);
    }

    @ObfuscatedName("ar.g(I)V")
    public void method680() {
        if (this.field407 != null) {
            this.field407.close();
            this.field407 = null;
        }
    }

    @ObfuscatedName("ar.i(I)V")
    public void method685() {
        this.field407.flush();
    }
}
