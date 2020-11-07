package main

import (
    "os"

    "sigs.k8s.io/kustomize/kyaml/fn/framework"
    "sigs.k8s.io/kustomize/kyaml/yaml"
)

func main() {
    type Data struct {
        Value string `yaml:"value,omitempty"`
    }
    type Example struct {
        Data Data `yaml:"data,omitempty"`
    }
    functionConfig := &Example{}
    resourceList := &framework.ResourceList{FunctionConfig: functionConfig}

    cmd := framework.Command(resourceList, func() error {
        for i := range resourceList.Items {
            err := resourceList.Items[i].PipeE(
                yaml.SetAnnotation("value", functionConfig.Data.Value),
            )
            if err != nil {
                return nil, err
            }
        }
        return items, nil
    })

    if err := cmd.Execute(); err != nil {
        os.Exit(1)
    }
}
