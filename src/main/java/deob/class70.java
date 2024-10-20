package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bh")
public class class70 extends class57 {

    @ObfuscatedName("bh.f")
    public AudioFormat field1291;

    @ObfuscatedName("bh.s")
    public SourceDataLine field1290;

    @ObfuscatedName("bh.af")
    public int field1289;

    @ObfuscatedName("bh.ax")
    public byte[] field1292;

    @ObfuscatedName("bh.f(Ljava/awt/Component;)V")
    public void method1102(Component arg0) {
        this.field1291 = new AudioFormat((float) Statics.field3153, 16, Statics.field1195 ? 2 : 1, true, false);
        this.field1292 = new byte[0x100 << (Statics.field1195 ? 2 : 1)];
    }

    @ObfuscatedName("bh.s(I)V")
    public void method1103(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1291, arg0 << (Statics.field1195 ? 2 : 1));
            this.field1290 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1290.open();
            this.field1290.start();
            this.field1289 = arg0;
        } catch (LineUnavailableException var4) {
            if (class126.method1188(arg0) == 1) {
                this.field1290 = null;
                throw var4;
            } else {
                this.method1103(class126.method575(arg0));
            }
        }
    }

    @ObfuscatedName("bh.q()I")
    public int method1104() {
        return this.field1289 - (this.field1290.available() >> (Statics.field1195 ? 2 : 1));
    }

    @ObfuscatedName("bh.g()V")
    public void method1113() {
        int var1 = 256;
        if (Statics.field1195) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1203[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1292[var2 * 2] = (byte) (var3 >> 8);
            this.field1292[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1290.write(this.field1292, 0, var1 << 1);
    }

    @ObfuscatedName("bh.m()V")
    public void method1105() {
        if (this.field1290 != null) {
            this.field1290.close();
            this.field1290 = null;
        }
    }

    @ObfuscatedName("bh.t()V")
    public void method1106() {
        this.field1290.flush();
    }
}
