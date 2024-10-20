package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("iw")
public class class224 {

    @ObfuscatedName("iw.ay")
    public Map field2423 = new HashMap();

    @ObfuscatedName("iw.an")
    public int field2421 = 0;

    @ObfuscatedName("iw.au")
    public static final class224 field2422 = new class224();

    @ObfuscatedName("iw.ab(Lorg/json/JSONObject;ILex;I)V")
    public void method4341(JSONObject arg0, int arg1, class117 arg2) {
        this.field2423.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field2421 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method4332(var4.getJSONArray("crmcomponents"), this.field2421, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("iw.ay(Lorg/json/JSONArray;ILex;B)V")
    public void method4332(JSONArray arg0, int arg1, class117 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class222 var7 = new class222();
                    try {
                        var7.method4307(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field2406.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field2423.put(var9, var7);
                    }
                }
            }
        }
        this.field2423 = this.method4333();
        class329.method5009();
    }

    @ObfuscatedName("iw.an(B)Ljava/util/Map;")
    public Map method4333() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field2423.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class222) ((Entry) var2.get(var4)).getValue()).method4295() > ((class222) ((Entry) var2.get(var4 + 1)).getValue()).method4295()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("iw.au(Ljava/lang/String;I)Lii;")
    public class222 method4334(String arg0) {
        return (class222) this.field2423.get(arg0);
    }
}
