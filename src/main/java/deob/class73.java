package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class73 extends class60 {

    @ObfuscatedName("bi.an")
    public AudioFormat field1330;

    @ObfuscatedName("bi.ag")
    public SourceDataLine field1328;

    @ObfuscatedName("bi.as")
    public int field1329;

    @ObfuscatedName("bi.aq")
    public byte[] field1331;

    @ObfuscatedName("bi.v(Ljava/awt/Component;B)V")
    public void method1191(Component arg0) {
        this.field1330 = new AudioFormat((float) Statics.field1229, 16, Statics.field1230 ? 2 : 1, true, false);
        this.field1331 = new byte[0x100 << (Statics.field1230 ? 2 : 1)];
    }

    @ObfuscatedName("bi.q(II)V")
    public void method1192(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1330, arg0 << (Statics.field1230 ? 2 : 1));
            this.field1328 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1328.open();
            this.field1328.start();
            this.field1329 = arg0;
        } catch (LineUnavailableException var4) {
            if (class130.method151(arg0) == 1) {
                this.field1328 = null;
                throw var4;
            } else {
                this.method1192(class130.method158(arg0));
            }
        }
    }

    @ObfuscatedName("bi.t(I)I")
    public int method1193() {
        return this.field1329 - (this.field1328.available() >> (Statics.field1230 ? 2 : 1));
    }

    @ObfuscatedName("bi.g()V")
    public void method1194() {
        int var1 = 256;
        if (Statics.field1230) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1226[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1331[var2 * 2] = (byte) (var3 >> 8);
            this.field1331[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1328.write(this.field1331, 0, var1 << 1);
    }

    @ObfuscatedName("bi.s(I)V")
    public void method1235() {
        if (this.field1328 != null) {
            this.field1328.close();
            this.field1328 = null;
        }
    }

    @ObfuscatedName("bi.h(I)V")
    public void method1185() {
        this.field1328.flush();
    }
}
