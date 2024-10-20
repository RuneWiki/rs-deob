package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fi")
public final class class174 extends class170 implements Runnable {

    @ObfuscatedName("fi.t")
    public InputStream field2214;

    @ObfuscatedName("fi.q")
    public OutputStream field2203;

    @ObfuscatedName("fi.i")
    public Socket field2215;

    @ObfuscatedName("fi.a")
    public boolean field2205 = false;

    @ObfuscatedName("fi.l")
    public class167 field2213;

    @ObfuscatedName("fi.b")
    public class166 field2204;

    @ObfuscatedName("fi.e")
    public byte[] field2208;

    @ObfuscatedName("fi.x")
    public int field2209 = 0;

    @ObfuscatedName("fi.p")
    public int field2210 = 0;

    @ObfuscatedName("fi.g")
    public boolean field2211 = false;

    @ObfuscatedName("fi.n")
    public final int field2202;

    @ObfuscatedName("fi.o")
    public final int field2212;

    public class174(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2213 = arg1;
        this.field2215 = arg0;
        this.field2202 = arg2;
        this.field2212 = arg2 - 100;
        this.field2215.setSoTimeout(30000);
        this.field2215.setTcpNoDelay(true);
        this.field2215.setReceiveBufferSize(65536);
        this.field2215.setSendBufferSize(65536);
        this.field2214 = this.field2215.getInputStream();
        this.field2203 = this.field2215.getOutputStream();
    }

    @ObfuscatedName("fi.b(I)V")
    public void method3022() {
        if (this.field2205) {
            return;
        }
        synchronized (this) {
            this.field2205 = true;
            this.notifyAll();
        }
        if (this.field2204 != null) {
            while (this.field2204.field2161 == 0) {
                class204.method1827(1L);
            }
            if (this.field2204.field2161 == 1) {
                try {
                    ((Thread) this.field2204.field2165).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2204 = null;
    }

    public void finalize() {
        this.method3022();
    }

    @ObfuscatedName("fi.i(I)I")
    public int method3019() throws IOException {
        return this.field2205 ? 0 : this.field2214.read();
    }

    @ObfuscatedName("fi.q(I)I")
    public int method3018() throws IOException {
        return this.field2205 ? 0 : this.field2214.available();
    }

    @ObfuscatedName("fi.t(IB)Z")
    public boolean method3017(int arg0) throws IOException {
        if (this.field2205) {
            return false;
        } else {
            return this.field2214.available() >= arg0;
        }
    }

    @ObfuscatedName("fi.a([BIII)I")
    public int method3020(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2205) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2214.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fi.av([BIII)V")
    public void method3063(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2205) {
            return;
        }
        if (this.field2211) {
            this.field2211 = false;
            throw new IOException();
        }
        if (this.field2208 == null) {
            this.field2208 = new byte[this.field2202];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2208[this.field2210] = arg0[arg1 + var5];
                this.field2210 = (this.field2210 + 1) % this.field2202;
                if ((this.field2212 + this.field2209) % this.field2202 == this.field2210) {
                    throw new IOException();
                }
            }
            if (this.field2204 == null) {
                this.field2204 = this.field2213.method2972(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2210 == this.field2209) {
                            if (this.field2205) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2209;
                        if (this.field2210 >= this.field2209) {
                            var4 = this.field2210 - this.field2209;
                        } else {
                            var4 = this.field2202 - this.field2209;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2203.write(this.field2208, var3, var4);
                    } catch (IOException var12) {
                        this.field2211 = true;
                    }
                    this.field2209 = (this.field2209 + var4) % this.field2202;
                    try {
                        if (this.field2210 == this.field2209) {
                            this.field2203.flush();
                        }
                    } catch (IOException var11) {
                        this.field2211 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2214 != null) {
                        this.field2214.close();
                    }
                    if (this.field2203 != null) {
                        this.field2203.close();
                    }
                    if (this.field2215 != null) {
                        this.field2215.close();
                    }
                } catch (IOException var10) {
                }
                this.field2208 = null;
                break;
            }
        } catch (Exception var15) {
            class165.method2453((String) null, var15);
        }
    }

    @ObfuscatedName("fi.l([BIII)V")
    public void method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3063(arg0, arg1, arg2);
    }
}
