````js
out = cloned.map(e => {e = Object.assign({}, e); let v = e.content["variants"]; if(!v) {return e}; let entries = Object.entries(v); const newV = {}; entries.map(entry => {let key = entry[0].split(",").filter(e => e !== ""); newV[key.concat(["covered_with_snow=false"]).join(",")] = entry[1]; newV[key.concat(["covered_with_snow=true"]).join(",")]={...entry[1], model: entry[1].model.replace("block/", "block/snowy/")}});  return {...e, content: {variants: newV}}});
out.map(e => fs.writeFileSync(`D:/Minecraft Modding/Fabric/sshcracks-christmas/src/client/resources/resourcepacks/christmas_pack/assets/minecraft/blockstates/${e.file}`, JSON.stringify(e.content, null, 1)))
````