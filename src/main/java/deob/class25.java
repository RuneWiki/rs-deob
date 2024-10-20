package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ar")
public class class25 extends class43 {

    @ObfuscatedName("ar.ak")
    public AudioFormat field126;

    @ObfuscatedName("ar.al")
    public SourceDataLine field128;

    @ObfuscatedName("ar.aj")
    public int field127;

    @ObfuscatedName("ar.az")
    public byte[] field125;

    @ObfuscatedName("ar.ak(B)V")
    public void method310() {
        this.field126 = new AudioFormat((float) Statics.field1509, 16, Statics.field1894 ? 2 : 1, true, false);
        this.field125 = new byte[0x100 << (Statics.field1894 ? 2 : 1)];
    }

    @ObfuscatedName("ar.al(IB)V")
    public void method309(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field126, arg0 << (Statics.field1894 ? 2 : 1));
            this.field128 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field128.open();
            this.field128.start();
            this.field127 = arg0;
        } catch (LineUnavailableException var4) {
            if (class328.method1863(arg0) == 1) {
                this.field128 = null;
                throw var4;
            } else {
                this.method309(Statics.method4498(arg0));
            }
        }
    }

    @ObfuscatedName("ar.aj(I)I")
    public int method321() {
        return this.field127 - (this.field128.available() >> (Statics.field1894 ? 2 : 1));
    }

    @ObfuscatedName("ar.az()V")
    public void method311() {
        int var1 = 256;
        if (Statics.field1894) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field284[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field125[var2 * 2] = (byte) (var3 >> 8);
            this.field125[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field128.write(this.field125, 0, var1 << 1);
    }

    @ObfuscatedName("ar.af(I)V")
    public void method312() {
        if (this.field128 != null) {
            this.field128.close();
            this.field128 = null;
        }
    }

    @ObfuscatedName("ar.aa(B)V")
    public void method313() {
        this.field128.flush();
    }
}
