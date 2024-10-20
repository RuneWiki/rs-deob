package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.l")
    public int field229;

    @ObfuscatedName("u.y")
    public class135 field227;

    @ObfuscatedName("u.g")
    public DataInputStream field226;

    @ObfuscatedName("u.j")
    public byte[] field228 = new byte[4];

    @ObfuscatedName("u.w")
    public int field230;

    @ObfuscatedName("u.c")
    public byte[] field231;

    @ObfuscatedName("u.x")
    public int field232;

    @ObfuscatedName("u.f")
    public long field233;

    public class17(class125 arg0, URL arg1) {
        this.field227 = arg0.method2499(arg1);
        this.field229 = 0;
        this.field233 = class104.method2616() + 30000L;
    }

    @ObfuscatedName("u.l(I)[B")
    public byte[] method167() throws IOException {
        if (class104.method2616() > this.field233) {
            throw new IOException();
        }
        if (this.field229 == 0) {
            if (this.field227.field2053 == 2) {
                throw new IOException();
            }
            if (this.field227.field2053 == 1) {
                this.field226 = (DataInputStream) this.field227.field2057;
                this.field229 = 1;
            }
        }
        if (this.field229 == 1) {
            int var1 = this.field226.available();
            if (var1 > 0) {
                if (this.field230 + var1 > 4) {
                    var1 = 4 - this.field230;
                }
                this.field230 += this.field226.read(this.field228, this.field230, var1);
                if (this.field230 == 4) {
                    int var2 = (new class108(this.field228)).method2297();
                    this.field231 = new byte[var2];
                    this.field229 = 2;
                }
            }
        }
        if (this.field229 == 2) {
            int var3 = this.field226.available();
            if (var3 > 0) {
                if (this.field232 + var3 > this.field231.length) {
                    var3 = this.field231.length - this.field232;
                }
                this.field232 += this.field226.read(this.field231, this.field232, var3);
                if (this.field232 == this.field231.length) {
                    return this.field231;
                }
            }
        }
        return null;
    }
}
