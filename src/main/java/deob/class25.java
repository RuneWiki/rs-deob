package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ae")
public class class25 extends class43 {

    @ObfuscatedName("ae.az")
    public AudioFormat field107;

    @ObfuscatedName("ae.ah")
    public SourceDataLine field108;

    @ObfuscatedName("ae.af")
    public int field109;

    @ObfuscatedName("ae.at")
    public byte[] field110;

    @ObfuscatedName("ae.az(I)V")
    public void method314() {
        this.field107 = new AudioFormat((float) Statics.field4893, 16, Statics.field277 ? 2 : 1, true, false);
        this.field110 = new byte[0x100 << (Statics.field277 ? 2 : 1)];
    }

    @ObfuscatedName("ae.ah(II)V")
    public void method297(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field107, arg0 << (Statics.field277 ? 2 : 1));
            this.field108 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field108.open();
            this.field108.start();
            this.field109 = arg0;
        } catch (LineUnavailableException var4) {
            if (class320.method2221(arg0) == 1) {
                this.field108 = null;
                throw var4;
            } else {
                this.method297(class320.method3400(arg0));
            }
        }
    }

    @ObfuscatedName("ae.af(I)I")
    public int method298() {
        return this.field109 - (this.field108.available() >> (Statics.field277 ? 2 : 1));
    }

    @ObfuscatedName("ae.at()V")
    public void method299() {
        int var1 = 256;
        if (Statics.field277) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field269[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field110[var2 * 2] = (byte) (var3 >> 8);
            this.field110[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field108.write(this.field110, 0, var1 << 1);
    }

    @ObfuscatedName("ae.an(I)V")
    public void method300() {
        if (this.field108 != null) {
            this.field108.close();
            this.field108 = null;
        }
    }

    @ObfuscatedName("ae.ao(S)V")
    public void method301() {
        this.field108.flush();
    }
}
