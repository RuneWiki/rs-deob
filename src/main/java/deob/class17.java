package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.g")
    public int field234;

    @ObfuscatedName("u.j")
    public class135 field226;

    @ObfuscatedName("u.z")
    public DataInputStream field236;

    @ObfuscatedName("u.b")
    public byte[] field228 = new byte[4];

    @ObfuscatedName("u.k")
    public int field227;

    @ObfuscatedName("u.c")
    public byte[] field230;

    @ObfuscatedName("u.w")
    public int field235;

    @ObfuscatedName("u.l")
    public long field232;

    public class17(class125 arg0, URL arg1) {
        this.field226 = arg0.method2444(arg1);
        this.field234 = 0;
        this.field232 = class104.method528() + 30000L;
    }

    @ObfuscatedName("u.g(I)[B")
    public byte[] method159() throws IOException {
        if (class104.method528() > this.field232) {
            throw new IOException();
        }
        if (this.field234 == 0) {
            if (this.field226.field2055 == 2) {
                throw new IOException();
            }
            if (this.field226.field2055 == 1) {
                this.field236 = (DataInputStream) this.field226.field2059;
                this.field234 = 1;
            }
        }
        if (this.field234 == 1) {
            int var1 = this.field236.available();
            if (var1 > 0) {
                if (this.field227 + var1 > 4) {
                    var1 = 4 - this.field227;
                }
                this.field227 += this.field236.read(this.field228, this.field227, var1);
                if (this.field227 == 4) {
                    int var2 = (new class108(this.field228)).method2117();
                    this.field230 = new byte[var2];
                    this.field234 = 2;
                }
            }
        }
        if (this.field234 == 2) {
            int var3 = this.field236.available();
            if (var3 > 0) {
                if (this.field235 + var3 > this.field230.length) {
                    var3 = this.field230.length - this.field235;
                }
                this.field235 += this.field236.read(this.field230, this.field235, var3);
                if (this.field235 == this.field230.length) {
                    return this.field230;
                }
            }
        }
        return null;
    }
}
