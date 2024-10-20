package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ar")
public class class27 extends class40 {

    @ObfuscatedName("ar.s")
    public AudioFormat field161;

    @ObfuscatedName("ar.h")
    public SourceDataLine field162;

    @ObfuscatedName("ar.w")
    public int field163;

    @ObfuscatedName("ar.v")
    public byte[] field164;

    @ObfuscatedName("ar.s(I)V")
    public void method358() {
        this.field161 = new AudioFormat((float) Statics.field4153, 16, Statics.field297 ? 2 : 1, true, false);
        this.field164 = new byte[0x100 << (Statics.field297 ? 2 : 1)];
    }

    @ObfuscatedName("ar.h(IB)V")
    public void method359(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field161, arg0 << (Statics.field297 ? 2 : 1));
            this.field162 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field162.open();
            this.field162.start();
            this.field163 = arg0;
        } catch (LineUnavailableException var4) {
            if (class272.method4387(arg0) == 1) {
                this.field162 = null;
                throw var4;
            } else {
                this.method359(class272.method4475(arg0));
            }
        }
    }

    @ObfuscatedName("ar.w(B)I")
    public int method360() {
        return this.field163 - (this.field162.available() >> (Statics.field297 ? 2 : 1));
    }

    @ObfuscatedName("ar.v()V")
    public void method361() {
        int var1 = 256;
        if (Statics.field297) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field285[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field164[var2 * 2] = (byte) (var3 >> 8);
            this.field164[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field162.write(this.field164, 0, var1 << 1);
    }

    @ObfuscatedName("ar.c(B)V")
    public void method374() {
        if (this.field162 != null) {
            this.field162.close();
            this.field162 = null;
        }
    }

    @ObfuscatedName("ar.q(I)V")
    public void method362() {
        this.field162.flush();
    }
}
