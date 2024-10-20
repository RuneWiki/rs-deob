package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class70 extends class57 {

    @ObfuscatedName("ba.e")
    public AudioFormat field1259;

    @ObfuscatedName("ba.w")
    public SourceDataLine field1256;

    @ObfuscatedName("ba.ae")
    public int field1258;

    @ObfuscatedName("ba.az")
    public byte[] field1257;

    @ObfuscatedName("ba.e(Ljava/awt/Component;)V")
    public void method1081(Component arg0) {
        this.field1259 = new AudioFormat((float) Statics.field1154, 16, Statics.field1161 ? 2 : 1, true, false);
        this.field1257 = new byte[0x100 << (Statics.field1161 ? 2 : 1)];
    }

    @ObfuscatedName("ba.w(I)V")
    public void method1094(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1259, arg0 << (Statics.field1161 ? 2 : 1));
            this.field1256 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1256.open();
            this.field1256.start();
            this.field1258 = arg0;
        } catch (LineUnavailableException var4) {
            if (class127.method1525(arg0) == 1) {
                this.field1256 = null;
                throw var4;
            } else {
                this.method1094(class127.method623(arg0));
            }
        }
    }

    @ObfuscatedName("ba.f()I")
    public int method1083() {
        return this.field1258 - (this.field1256.available() >> (Statics.field1161 ? 2 : 1));
    }

    @ObfuscatedName("ba.s()V")
    public void method1086() {
        int var1 = 256;
        if (Statics.field1161) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1152[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1257[var2 * 2] = (byte) (var3 >> 8);
            this.field1257[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1256.write(this.field1257, 0, var1 << 1);
    }

    @ObfuscatedName("ba.p()V")
    public void method1084() {
        if (this.field1256 != null) {
            this.field1256.close();
            this.field1256 = null;
        }
    }

    @ObfuscatedName("ba.h()V")
    public void method1085() {
        this.field1256.flush();
    }
}
