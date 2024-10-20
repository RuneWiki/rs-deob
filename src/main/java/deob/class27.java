package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("as")
public class class27 extends class40 {

    @ObfuscatedName("as.c")
    public AudioFormat field163;

    @ObfuscatedName("as.p")
    public SourceDataLine field164;

    @ObfuscatedName("as.f")
    public int field165;

    @ObfuscatedName("as.n")
    public byte[] field166;

    @ObfuscatedName("as.c(I)V")
    public void method378() {
        this.field163 = new AudioFormat((float) Statics.field308, 16, Statics.field298 ? 2 : 1, true, false);
        this.field166 = new byte[0x100 << (Statics.field298 ? 2 : 1)];
    }

    @ObfuscatedName("as.p(IS)V")
    public void method387(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field163, arg0 << (Statics.field298 ? 2 : 1));
            this.field164 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field164.open();
            this.field164.start();
            this.field165 = arg0;
        } catch (LineUnavailableException var4) {
            if (class273.method3658(arg0) == 1) {
                this.field164 = null;
                throw var4;
            } else {
                this.method387(class273.method2989(arg0));
            }
        }
    }

    @ObfuscatedName("as.f(I)I")
    public int method384() {
        return this.field165 - (this.field164.available() >> (Statics.field298 ? 2 : 1));
    }

    @ObfuscatedName("as.n()V")
    public void method386() {
        int var1 = 256;
        if (Statics.field298) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field300[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field166[var2 * 2] = (byte) (var3 >> 8);
            this.field166[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field164.write(this.field166, 0, var1 << 1);
    }

    @ObfuscatedName("as.k(I)V")
    public void method376() {
        if (this.field164 != null) {
            this.field164.close();
            this.field164 = null;
        }
    }

    @ObfuscatedName("as.w(I)V")
    public void method382() {
        this.field164.flush();
    }
}
