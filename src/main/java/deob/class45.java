package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class45 extends class98 {

    @ObfuscatedName("ao.g")
    public AudioFormat field415;

    @ObfuscatedName("ao.r")
    public SourceDataLine field416;

    @ObfuscatedName("ao.e")
    public int field418;

    @ObfuscatedName("ao.q")
    public byte[] field417;

    @ObfuscatedName("ao.g(I)V")
    public void method716() {
        this.field415 = new AudioFormat((float) Statics.field1378, 16, Statics.field265 ? 2 : 1, true, false);
        this.field417 = new byte[0x100 << (Statics.field265 ? 2 : 1)];
    }

    @ObfuscatedName("ao.r(IB)V")
    public void method717(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field415, arg0 << (Statics.field265 ? 2 : 1));
            this.field416 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field416.open();
            this.field416.start();
            this.field418 = arg0;
        } catch (LineUnavailableException var4) {
            if (class190.method991(arg0) == 1) {
                this.field416 = null;
                throw var4;
            } else {
                this.method717(class190.method29(arg0));
            }
        }
    }

    @ObfuscatedName("ao.e(I)I")
    public int method718() {
        return this.field418 - (this.field416.available() >> (Statics.field265 ? 2 : 1));
    }

    @ObfuscatedName("ao.q()V")
    public void method719() {
        int var1 = 256;
        if (Statics.field265) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1363[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field417[var2 * 2] = (byte) (var3 >> 8);
            this.field417[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field416.write(this.field417, 0, var1 << 1);
    }

    @ObfuscatedName("ao.c(I)V")
    public void method725() {
        if (this.field416 != null) {
            this.field416.close();
            this.field416 = null;
        }
    }

    @ObfuscatedName("ao.i(I)V")
    public void method731() {
        this.field416.flush();
    }
}
