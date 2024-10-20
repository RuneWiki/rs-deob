package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fy")
public final class class160 implements Runnable {

    @ObfuscatedName("fy.p")
    public InputStream field2279;

    @ObfuscatedName("fy.m")
    public OutputStream field2284;

    @ObfuscatedName("fy.e")
    public Socket field2281;

    @ObfuscatedName("fy.t")
    public boolean field2282 = false;

    @ObfuscatedName("fy.w")
    public class155 field2283;

    @ObfuscatedName("fy.z")
    public class154 field2280;

    @ObfuscatedName("fy.j")
    public byte[] field2285;

    @ObfuscatedName("fy.i")
    public int field2286 = 0;

    @ObfuscatedName("fy.f")
    public int field2287 = 0;

    @ObfuscatedName("fy.c")
    public boolean field2288 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2283 = arg1;
        this.field2281 = arg0;
        this.field2281.setSoTimeout(30000);
        this.field2281.setTcpNoDelay(true);
        this.field2281.setReceiveBufferSize(16384);
        this.field2281.setSendBufferSize(16384);
        this.field2279 = this.field2281.getInputStream();
        this.field2284 = this.field2281.getOutputStream();
    }

    @ObfuscatedName("fy.p(B)V")
    public void method2662() {
        if (this.field2282) {
            return;
        }
        synchronized (this) {
            this.field2282 = true;
            this.notifyAll();
        }
        if (this.field2280 != null) {
            while (this.field2280.field2238 == 0) {
                class182.method2791(1L);
            }
            if (this.field2280.field2238 == 1) {
                try {
                    ((Thread) this.field2280.field2242).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2280 = null;
    }

    public void finalize() {
        this.method2662();
    }

    @ObfuscatedName("fy.m(I)I")
    public int method2663() throws IOException {
        return this.field2282 ? 0 : this.field2279.read();
    }

    @ObfuscatedName("fy.e(B)I")
    public int method2664() throws IOException {
        return this.field2282 ? 0 : this.field2279.available();
    }

    @ObfuscatedName("fy.t([BIII)V")
    public void method2665(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2282) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2279.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fy.w([BIII)V")
    public void method2672(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2282) {
            return;
        }
        if (this.field2288) {
            this.field2288 = false;
            throw new IOException();
        }
        if (this.field2285 == null) {
            this.field2285 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2285[this.field2287] = arg0[arg1 + var5];
                this.field2287 = (this.field2287 + 1) % 5000;
                if ((this.field2286 + 4900) % 5000 == this.field2287) {
                    throw new IOException();
                }
            }
            if (this.field2280 == null) {
                this.field2280 = this.field2283.method2617(this, 3);
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
                        if (this.field2287 == this.field2286) {
                            if (this.field2282) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2286;
                        if (this.field2287 >= this.field2286) {
                            var4 = this.field2287 - this.field2286;
                        } else {
                            var4 = 5000 - this.field2286;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2284.write(this.field2285, var3, var4);
                    } catch (IOException var12) {
                        this.field2288 = true;
                    }
                    this.field2286 = (this.field2286 + var4) % 5000;
                    try {
                        if (this.field2287 == this.field2286) {
                            this.field2284.flush();
                        }
                    } catch (IOException var11) {
                        this.field2288 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2279 != null) {
                        this.field2279.close();
                    }
                    if (this.field2284 != null) {
                        this.field2284.close();
                    }
                    if (this.field2281 != null) {
                        this.field2281.close();
                    }
                } catch (IOException var10) {
                }
                this.field2285 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method40((String) null, var15);
        }
    }
}
