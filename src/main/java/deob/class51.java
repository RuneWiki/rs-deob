package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class51 extends class106 {

    @ObfuscatedName("ap.c")
    public AudioFormat field428;

    @ObfuscatedName("ap.t")
    public SourceDataLine field427;

    @ObfuscatedName("ap.o")
    public int field429;

    @ObfuscatedName("ap.e")
    public byte[] field430;

    @ObfuscatedName("ap.c(B)V")
    public void method723() {
        this.field428 = new AudioFormat((float) Statics.field1399, 16, Statics.field1394 ? 2 : 1, true, false);
        this.field430 = new byte[0x100 << (Statics.field1394 ? 2 : 1)];
    }

    @ObfuscatedName("ap.t(II)V")
    public void method741(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field428, arg0 << (Statics.field1394 ? 2 : 1));
            this.field427 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field427.open();
            this.field427.start();
            this.field429 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field427 = null;
                throw var11;
            } else {
                this.method741(class189.method2097(arg0));
            }
        }
    }

    @ObfuscatedName("ap.o(I)I")
    public int method725() {
        return this.field429 - (this.field427.available() >> (Statics.field1394 ? 2 : 1));
    }

    @ObfuscatedName("ap.e()V")
    public void method726() {
        int var1 = 256;
        if (Statics.field1394) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1393[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field430[var2 * 2] = (byte) (var3 >> 8);
            this.field430[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field427.write(this.field430, 0, var1 << 1);
    }

    @ObfuscatedName("ap.i(I)V")
    public void method738() {
        if (this.field427 != null) {
            this.field427.close();
            this.field427 = null;
        }
    }

    @ObfuscatedName("ap.g(I)V")
    public void method728() {
        this.field427.flush();
    }
}
