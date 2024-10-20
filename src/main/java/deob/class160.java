package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fs")
public final class class160 implements Runnable {

    @ObfuscatedName("fs.i")
    public OutputStream field2286;

    @ObfuscatedName("fs.w")
    public InputStream field2276;

    @ObfuscatedName("fs.a")
    public Socket field2277;

    @ObfuscatedName("fs.t")
    public boolean field2278 = false;

    @ObfuscatedName("fs.s")
    public class155 field2279;

    @ObfuscatedName("fs.r")
    public class154 field2280;

    @ObfuscatedName("fs.v")
    public byte[] field2281;

    @ObfuscatedName("fs.y")
    public int field2282 = 0;

    @ObfuscatedName("fs.j")
    public int field2283 = 0;

    @ObfuscatedName("fs.k")
    public boolean field2284 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2279 = arg1;
        this.field2277 = arg0;
        this.field2277.setSoTimeout(30000);
        this.field2277.setTcpNoDelay(true);
        this.field2277.setReceiveBufferSize(16384);
        this.field2277.setSendBufferSize(16384);
        this.field2276 = this.field2277.getInputStream();
        this.field2286 = this.field2277.getOutputStream();
    }

    @ObfuscatedName("fs.i(I)V")
    public void method2711() {
        if (this.field2278) {
            return;
        }
        synchronized (this) {
            this.field2278 = true;
            this.notifyAll();
        }
        if (this.field2280 != null) {
            while (this.field2280.field2244 == 0) {
                class182.method1004(1L);
            }
            if (this.field2280.field2244 == 1) {
                try {
                    ((Thread) this.field2280.field2240).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2280 = null;
    }

    public void finalize() {
        this.method2711();
    }

    @ObfuscatedName("fs.w(I)I")
    public int method2716() throws IOException {
        return this.field2278 ? 0 : this.field2276.read();
    }

    @ObfuscatedName("fs.a(S)I")
    public int method2710() throws IOException {
        return this.field2278 ? 0 : this.field2276.available();
    }

    @ObfuscatedName("fs.t([BIII)V")
    public void method2712(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2278) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2276.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fs.s([BIII)V")
    public void method2723(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2278) {
            return;
        }
        if (this.field2284) {
            this.field2284 = false;
            throw new IOException();
        }
        if (this.field2281 == null) {
            this.field2281 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2281[this.field2283] = arg0[arg1 + var5];
                this.field2283 = (this.field2283 + 1) % 5000;
                if ((this.field2282 + 4900) % 5000 == this.field2283) {
                    throw new IOException();
                }
            }
            if (this.field2280 == null) {
                this.field2280 = this.field2279.method2673(this, 3);
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
                        if (this.field2283 == this.field2282) {
                            if (this.field2278) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2282;
                        if (this.field2283 >= this.field2282) {
                            var4 = this.field2283 - this.field2282;
                        } else {
                            var4 = 5000 - this.field2282;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2286.write(this.field2281, var3, var4);
                    } catch (IOException var12) {
                        this.field2284 = true;
                    }
                    this.field2282 = (this.field2282 + var4) % 5000;
                    try {
                        if (this.field2283 == this.field2282) {
                            this.field2286.flush();
                        }
                    } catch (IOException var11) {
                        this.field2284 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2276 != null) {
                        this.field2276.close();
                    }
                    if (this.field2286 != null) {
                        this.field2286.close();
                    }
                    if (this.field2277 != null) {
                        this.field2277.close();
                    }
                } catch (IOException var10) {
                }
                this.field2281 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method2658((String) null, var15);
        }
    }
}
