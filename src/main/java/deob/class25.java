package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("g")
public class class25 extends class43 {

    @ObfuscatedName("g.f")
    public AudioFormat field142;

    @ObfuscatedName("g.w")
    public SourceDataLine field143;

    @ObfuscatedName("g.v")
    public int field144;

    @ObfuscatedName("g.s")
    public byte[] field145;

    @ObfuscatedName("g.f(I)V")
    public void method325() {
        this.field142 = new AudioFormat((float) Statics.field3322, 16, Statics.field321 ? 2 : 1, true, false);
        this.field145 = new byte[0x100 << (Statics.field321 ? 2 : 1)];
    }

    @ObfuscatedName("g.w(II)V")
    public void method335(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field142, arg0 << (Statics.field321 ? 2 : 1));
            this.field143 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field143.open();
            this.field143.start();
            this.field144 = arg0;
        } catch (LineUnavailableException var4) {
            if (class289.method6463(arg0) == 1) {
                this.field143 = null;
                throw var4;
            } else {
                this.method335(class289.method16(arg0));
            }
        }
    }

    @ObfuscatedName("g.v(I)I")
    public int method327() {
        return this.field144 - (this.field143.available() >> (Statics.field321 ? 2 : 1));
    }

    @ObfuscatedName("g.s()V")
    public void method328() {
        int var1 = 256;
        if (Statics.field321) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field309[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field145[var2 * 2] = (byte) (var3 >> 8);
            this.field145[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field143.write(this.field145, 0, var1 << 1);
    }

    @ObfuscatedName("g.z(I)V")
    public void method329() {
        if (this.field143 != null) {
            this.field143.close();
            this.field143 = null;
        }
    }

    @ObfuscatedName("g.j(I)V")
    public void method330() {
        this.field143.flush();
    }
}
