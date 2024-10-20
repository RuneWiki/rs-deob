package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class70 extends class57 {

    @ObfuscatedName("bv.t")
    public AudioFormat field1290;

    @ObfuscatedName("bv.i")
    public SourceDataLine field1289;

    @ObfuscatedName("bv.al")
    public int field1288;

    @ObfuscatedName("bv.av")
    public byte[] field1291;

    @ObfuscatedName("bv.t(Ljava/awt/Component;)V")
    public void method1042(Component arg0) {
        this.field1290 = new AudioFormat((float) Statics.field1195, 16, Statics.field576 ? 2 : 1, true, false);
        this.field1291 = new byte[0x100 << (Statics.field576 ? 2 : 1)];
    }

    @ObfuscatedName("bv.i(I)V")
    public void method1058(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1290, arg0 << (Statics.field576 ? 2 : 1));
            this.field1289 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1289.open();
            this.field1289.start();
            this.field1288 = arg0;
        } catch (LineUnavailableException var4) {
            if (class127.method1101(arg0) == 1) {
                this.field1289 = null;
                throw var4;
            } else {
                this.method1058(class127.method566(arg0));
            }
        }
    }

    @ObfuscatedName("bv.g()I")
    public int method1044() {
        return this.field1288 - (this.field1289.available() >> (Statics.field576 ? 2 : 1));
    }

    @ObfuscatedName("bv.h()V")
    public void method1045() {
        int var1 = 256;
        if (Statics.field576) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1198[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1291[var2 * 2] = (byte) (var3 >> 8);
            this.field1291[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1289.write(this.field1291, 0, var1 << 1);
    }

    @ObfuscatedName("bv.z()V")
    public void method1046() {
        if (this.field1289 != null) {
            this.field1289.close();
            this.field1289 = null;
        }
    }

    @ObfuscatedName("bv.r()V")
    public void method1041() {
        this.field1289.flush();
    }
}
