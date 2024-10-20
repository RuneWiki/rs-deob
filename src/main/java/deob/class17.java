package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("p")
public class class17 {

    @ObfuscatedName("p.k")
    public int field225;

    @ObfuscatedName("p.y")
    public class133 field231;

    @ObfuscatedName("p.s")
    public DataInputStream field226;

    @ObfuscatedName("p.g")
    public byte[] field227 = new byte[4];

    @ObfuscatedName("p.h")
    public int field228;

    @ObfuscatedName("p.l")
    public byte[] field229;

    @ObfuscatedName("p.e")
    public int field230;

    @ObfuscatedName("p.u")
    public long field234;

    public class17(class123 arg0, URL arg1) {
        this.field231 = arg0.method2505(arg1);
        this.field225 = 0;
        this.field234 = class103.method16() + 30000L;
    }

    @ObfuscatedName("p.k(B)[B")
    public byte[] method154() throws IOException {
        if (class103.method16() > this.field234) {
            throw new IOException();
        }
        if (this.field225 == 0) {
            if (this.field231.field2072 == 2) {
                throw new IOException();
            }
            if (this.field231.field2072 == 1) {
                this.field226 = (DataInputStream) this.field231.field2068;
                this.field225 = 1;
            }
        }
        if (this.field225 == 1) {
            int var1 = this.field226.available();
            if (var1 > 0) {
                if (this.field228 + var1 > 4) {
                    var1 = 4 - this.field228;
                }
                this.field228 += this.field226.read(this.field227, this.field228, var1);
                if (this.field228 == 4) {
                    int var2 = (new class107(this.field227)).method2143();
                    this.field229 = new byte[var2];
                    this.field225 = 2;
                }
            }
        }
        if (this.field225 == 2) {
            int var3 = this.field226.available();
            if (var3 > 0) {
                if (this.field230 + var3 > this.field229.length) {
                    var3 = this.field229.length - this.field230;
                }
                this.field230 += this.field226.read(this.field229, this.field230, var3);
                if (this.field230 == this.field229.length) {
                    return this.field229;
                }
            }
        }
        return null;
    }
}
