package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fb")
public final class class160 implements Runnable {

    @ObfuscatedName("fb.c")
    public InputStream field2235;

    @ObfuscatedName("fb.o")
    public Socket field2229;

    @ObfuscatedName("fb.i")
    public OutputStream field2227;

    @ObfuscatedName("fb.u")
    public boolean field2230 = false;

    @ObfuscatedName("fb.g")
    public class155 field2231;

    @ObfuscatedName("fb.m")
    public class154 field2237;

    @ObfuscatedName("fb.s")
    public byte[] field2233;

    @ObfuscatedName("fb.x")
    public int field2234 = 0;

    @ObfuscatedName("fb.p")
    public int field2232 = 0;

    @ObfuscatedName("fb.k")
    public boolean field2236 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2231 = arg1;
        this.field2229 = arg0;
        this.field2229.setSoTimeout(30000);
        this.field2229.setTcpNoDelay(true);
        this.field2229.setReceiveBufferSize(16384);
        this.field2229.setSendBufferSize(16384);
        this.field2235 = this.field2229.getInputStream();
        this.field2227 = this.field2229.getOutputStream();
    }

    @ObfuscatedName("fb.c(I)V")
    public void method2684() {
        if (this.field2230) {
            return;
        }
        synchronized (this) {
            this.field2230 = true;
            this.notifyAll();
        }
        if (this.field2237 != null) {
            while (this.field2237.field2189 == 0) {
                Statics.method2614(1L);
            }
            if (this.field2237.field2189 == 1) {
                try {
                    ((Thread) this.field2237.field2193).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2237 = null;
    }

    public void finalize() {
        this.method2684();
    }

    @ObfuscatedName("fb.o(I)I")
    public int method2686() throws IOException {
        return this.field2230 ? 0 : this.field2235.read();
    }

    @ObfuscatedName("fb.i(I)I")
    public int method2687() throws IOException {
        return this.field2230 ? 0 : this.field2235.available();
    }

    @ObfuscatedName("fb.u([BIIB)V")
    public void method2688(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2230) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2235.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fb.g([BIIB)V")
    public void method2689(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2230) {
            return;
        }
        if (this.field2236) {
            this.field2236 = false;
            throw new IOException();
        }
        if (this.field2233 == null) {
            this.field2233 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2233[this.field2232] = arg0[arg1 + var5];
                this.field2232 = (this.field2232 + 1) % 5000;
                if ((this.field2234 + 4900) % 5000 == this.field2232) {
                    throw new IOException();
                }
            }
            if (this.field2237 == null) {
                this.field2237 = this.field2231.method2645(this, 3);
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
                        if (this.field2234 == this.field2232) {
                            if (this.field2230) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2234;
                        if (this.field2232 >= this.field2234) {
                            var4 = this.field2232 - this.field2234;
                        } else {
                            var4 = 5000 - this.field2234;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2227.write(this.field2233, var3, var4);
                    } catch (IOException var12) {
                        this.field2236 = true;
                    }
                    this.field2234 = (this.field2234 + var4) % 5000;
                    try {
                        if (this.field2234 == this.field2232) {
                            this.field2227.flush();
                        }
                    } catch (IOException var11) {
                        this.field2236 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2235 != null) {
                        this.field2235.close();
                    }
                    if (this.field2227 != null) {
                        this.field2227.close();
                    }
                    if (this.field2229 != null) {
                        this.field2229.close();
                    }
                } catch (IOException var10) {
                }
                this.field2233 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method463((String) null, var15);
        }
    }
}
