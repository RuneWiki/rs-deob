package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("av")
public class class25 extends class43 {

    @ObfuscatedName("av.aq")
    public AudioFormat field112;

    @ObfuscatedName("av.aw")
    public SourceDataLine field111;

    @ObfuscatedName("av.al")
    public int field110;

    @ObfuscatedName("av.ai")
    public byte[] field113;

    @ObfuscatedName("av.aq(B)V")
    public void method294() {
        this.field112 = new AudioFormat((float) Statics.field296, 16, Statics.field297 ? 2 : 1, true, false);
        this.field113 = new byte[0x100 << (Statics.field297 ? 2 : 1)];
    }

    @ObfuscatedName("av.aw(IB)V")
    public void method296(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field112, arg0 << (Statics.field297 ? 2 : 1));
            this.field111 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field111.open();
            this.field111.start();
            this.field110 = arg0;
        } catch (LineUnavailableException var4) {
            if (class320.method5741(arg0) == 1) {
                this.field111 = null;
                throw var4;
            } else {
                this.method296(class320.method5477(arg0));
            }
        }
    }

    @ObfuscatedName("av.al(I)I")
    public int method297() {
        return this.field110 - (this.field111.available() >> (Statics.field297 ? 2 : 1));
    }

    @ObfuscatedName("av.ai()V")
    public void method298() {
        int var1 = 256;
        if (Statics.field297) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field281[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field113[var2 * 2] = (byte) (var3 >> 8);
            this.field113[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field111.write(this.field113, 0, var1 << 1);
    }

    @ObfuscatedName("av.ar(B)V")
    public void method299() {
        if (this.field111 != null) {
            this.field111.close();
            this.field111 = null;
        }
    }

    @ObfuscatedName("av.as(I)V")
    public void method300() {
        this.field111.flush();
    }
}
