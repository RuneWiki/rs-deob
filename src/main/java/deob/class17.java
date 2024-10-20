package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.b")
    public int field228;

    @ObfuscatedName("f.e")
    public class137 field225;

    @ObfuscatedName("f.i")
    public byte[] field236 = new byte[4];

    @ObfuscatedName("f.k")
    public DataInputStream field224;

    @ObfuscatedName("f.h")
    public int field227;

    @ObfuscatedName("f.p")
    public byte[] field229;

    @ObfuscatedName("f.n")
    public int field230;

    @ObfuscatedName("f.o")
    public long field234;

    public class17(class127 arg0, URL arg1) {
        this.field225 = arg0.method2498(arg1);
        this.field228 = 0;
        this.field234 = class106.method3592() + 30000L;
    }

    @ObfuscatedName("f.b(B)[B")
    public byte[] method157() throws IOException {
        if (class106.method3592() > this.field234) {
            throw new IOException();
        }
        if (this.field228 == 0) {
            if (this.field225.field2088 == 2) {
                throw new IOException();
            }
            if (this.field225.field2088 == 1) {
                this.field224 = (DataInputStream) this.field225.field2089;
                this.field228 = 1;
            }
        }
        if (this.field228 == 1) {
            int var1 = this.field224.available();
            if (var1 > 0) {
                if (this.field227 + var1 > 4) {
                    var1 = 4 - this.field227;
                }
                this.field227 += this.field224.read(this.field236, this.field227, var1);
                if (this.field227 == 4) {
                    int var2 = (new class110(this.field236)).method2195();
                    this.field229 = new byte[var2];
                    this.field228 = 2;
                }
            }
        }
        if (this.field228 == 2) {
            int var3 = this.field224.available();
            if (var3 > 0) {
                if (this.field230 + var3 > this.field229.length) {
                    var3 = this.field229.length - this.field230;
                }
                this.field230 += this.field224.read(this.field229, this.field230, var3);
                if (this.field230 == this.field229.length) {
                    return this.field229;
                }
            }
        }
        return null;
    }
}
