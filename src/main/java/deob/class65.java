package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bt")
public class class65 extends class52 {

    @ObfuscatedName("bt.n")
    public AudioFormat field1220;

    @ObfuscatedName("bt.d")
    public SourceDataLine field1219;

    @ObfuscatedName("bt.ax")
    public int field1218;

    @ObfuscatedName("bt.al")
    public byte[] field1221;

    @ObfuscatedName("bt.n(Ljava/awt/Component;)V")
    public void method987(Component arg0) {
        this.field1220 = new AudioFormat((float) Statics.field3058, 16, Statics.field619 ? 2 : 1, true, false);
        this.field1221 = new byte[0x100 << (Statics.field619 ? 2 : 1)];
    }

    @ObfuscatedName("bt.d(I)V")
    public void method988(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1220, arg0 << (Statics.field619 ? 2 : 1));
            this.field1219 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1219.open();
            this.field1219.start();
            this.field1218 = arg0;
        } catch (LineUnavailableException var4) {
            if (class118.method1859(arg0) == 1) {
                this.field1219 = null;
                throw var4;
            } else {
                this.method988(class118.method1488(arg0));
            }
        }
    }

    @ObfuscatedName("bt.z()I")
    public int method989() {
        return this.field1218 - (this.field1219.available() >> (Statics.field619 ? 2 : 1));
    }

    @ObfuscatedName("bt.y()V")
    public void method999() {
        int var1 = 256;
        if (Statics.field619) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1112[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1221[var2 * 2] = (byte) (var3 >> 8);
            this.field1221[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1219.write(this.field1221, 0, var1 << 1);
    }

    @ObfuscatedName("bt.e()V")
    public void method995() {
        if (this.field1219 != null) {
            this.field1219.close();
            this.field1219 = null;
        }
    }

    @ObfuscatedName("bt.g()V")
    public void method991() {
        this.field1219.flush();
    }
}
